
package aula8_db.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {
    
    public void inserir(Usuario usuario) {
        String sql = "insert into usuario(usuario,senha) values (?,?)";
        
        try(Connection conn = ConnectionFactory.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            
            stmt.executeUpdate();
        }
        catch (SQLException ex) {
            System.out.println(UsuarioDAO.class.getName()+" "+ex.getMessage());
        }
    }
    
    public void editar(Usuario usuario) {
        String sql = "update usuario set usuario = ?, senha = ? where id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getSenha());
            stmt.setInt(3, usuario.getId());
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao editar usuário: " + ex.getMessage());
        }
    }
    
    public void excluir(int codigo) {
        String sql = "delete from usuario where id = ?";

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, codigo);
            
            stmt.execute();
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir usuário: " + ex.getMessage());
        }
    }

    public ArrayList<Usuario> getAllUsuarios() {
        String sql = "SELECT * FROM usuario";
        ArrayList<Usuario> usuarios = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql); 
                ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                String login = rs.getString("usuario");
                String senha = rs.getString("senha");
                int id_usuario = rs.getInt("id");

                Usuario usuario = new Usuario(login, senha);
                usuario.setId(id_usuario);
                
                usuarios.add(usuario);
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Todos usuário: " + ex.getMessage());
        }

        return usuarios;
    }
    
    public boolean autenticar(String login, String senha) {
        Usuario usuario = null;
        String sql = "select * from Usuario where usuario = ? and senha = ?";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);){
            
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao autenticar usuário: " + ex.getMessage());
        }
        
        return false;
    }
}
