package aula9.dao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/*
    1- A Classe DAO precisa começar com o nome da Tabela
        Ex: Tabela produto, a classe deve se chamar ProdutoDAO
    2- A classe que herda do GenericDAO precisa ter um construtor vazio.
        Ex:  ProdutoDAO ter  public ProdutoDAO() { }
    3- precisa ter a classe "IgnoreInDAO" no Projeto
    4- No Banco, a chave primaria precisa ter o nome "id"
*/

public abstract class GenericDAO<T> {
    private final String tableName;

    public GenericDAO() {
        this.tableName = this.getClass().getSimpleName().replaceAll("DAO", "").toLowerCase();
    }
    

    public void inserir(T entity) {
        StringBuilder columns = new StringBuilder();
        StringBuilder values = new StringBuilder();

        Field[] declaredFields = entity.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            
            if (!fieldName.equals("id") && !field.isAnnotationPresent(IgnoreInDAO.class)) { // Ignorar o campo de ID, supondo que ele seja autoincrementável
                columns.append(fieldName).append(",");
                values.append("?").append(",");
            }
        }

        // Remover a última vírgula das strings
        columns.deleteCharAt(columns.length() - 1);
        values.deleteCharAt(values.length() - 1);

        String sql = "INSERT INTO " + tableName + " (" + columns + ") VALUES (" + values + ")";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            int parameterIndex = 1;
            for (Field field : declaredFields) {
                field.setAccessible(true);
                String fieldName = field.getName();
                if (!fieldName.equals("id")&& !field.isAnnotationPresent(IgnoreInDAO.class)) { // Ignorar o campo de ID
                    Object value = field.get(entity);
                    stmt.setObject(parameterIndex, value);
                    parameterIndex++;
                }
            }

            stmt.executeUpdate();
        } catch (SQLException | IllegalAccessException ex) {
            System.out.println("Erro ao inserir: " + ex.getMessage());
        }
    }

    public void editar(T entity) {
        StringBuilder setClause = new StringBuilder();

        Field[] declaredFields = entity.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            String fieldName = field.getName();
            if (!fieldName.equals("id")) { // Ignorar o campo de ID, supondo que ele seja autoincrementável
                setClause.append(fieldName).append(" = ?, ");
            }
        }

        // Remover a última vírgula e espaço em branco da cláusula SET
        setClause.delete(setClause.length() - 2, setClause.length());

        String sql = "UPDATE " + tableName + " SET " + setClause + " WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            int parameterIndex = 1;
            for (Field field : declaredFields) {
                field.setAccessible(true);
                String fieldName = field.getName();
                if (!fieldName.equals("id")) { // Ignorar o campo de ID
                    Object value = field.get(entity);
                    stmt.setObject(parameterIndex, value);
                    parameterIndex++;
                }
            }

            // Definir o valor do campo de ID (supondo que o campo de ID seja chamado "id")
            Field idField = entity.getClass().getDeclaredField("id");
            idField.setAccessible(true);
            Object idValue = idField.get(entity);
            stmt.setObject(parameterIndex, idValue);

            stmt.executeUpdate();
        } catch (SQLException | IllegalAccessException | NoSuchFieldException ex) {
            System.out.println("Erro ao editar: " + ex.getMessage());
        }
    }

    public void excluir(int id) {
        String idColumnName = "id"; // Supondo que o nome da coluna de ID seja "id"
        String sql = "DELETE FROM " + tableName + " WHERE " + idColumnName + " = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir: " + ex.getMessage());
        }
    }

    public ArrayList<T> getAll(Class<? extends T> entityClass) {
        String sql = "SELECT * FROM " + tableName;
        ArrayList<T> entities = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            Constructor<? extends T> constructor = entityClass.getDeclaredConstructor();
            while (rs.next()) {
                T entity = constructor.newInstance();

                Field[] declaredFields = entityClass.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    String fieldName = field.getName();
                    Object value = rs.getObject(fieldName);

                    // Se o valor do banco de dados for BigDecimal e o campo for double, converter para double
                    if (value instanceof BigDecimal && field.getType().equals(double.class)) {
                        value = ((BigDecimal) value).doubleValue();
                    }

                    // Define o valor do campo na entidade usando reflexão
                    field.set(entity, value);
                }

                entities.add(entity);
            }
        } catch (SQLException | ReflectiveOperationException ex) {
            System.out.println("Erro ao buscar todos: " + ex.getMessage());
        }

        return entities;
    }

    public T getByField(Class<? extends T> entityClass, String fieldName, Object value) {
        String sql = "SELECT * FROM " + tableName + " WHERE " + fieldName + " = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setObject(1, value);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Constructor<? extends T> constructor = entityClass.getDeclaredConstructor();
                T entity = constructor.newInstance();

                Field[] declaredFields = entityClass.getDeclaredFields();
                for (Field field : declaredFields) {
                    field.setAccessible(true);
                    String fieldNameTmp = field.getName();
                    Object fieldValue = rs.getObject(fieldNameTmp);
                    
                    // Se o valor do banco de dados for BigDecimal e o campo for double, converter para double
                    if (fieldValue instanceof BigDecimal && field.getType().equals(double.class)) {
                        fieldValue = ((BigDecimal) fieldValue).doubleValue();
                    }
                    field.set(entity, fieldValue);
                }

                return entity;
            }
        } catch (SQLException | ReflectiveOperationException ex) {
            System.out.println("Erro ao buscar por campo: " + ex.getMessage());
        }

        return null;
    }

}
