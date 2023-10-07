package aula8_db.db;

import java.util.ArrayList;

public class MainDB {
    public static void main(String[] args) {
        //Usuario usu = new Usuario("maria", "321");
        //usu.setId(1);
        
        //UsuarioDAO usuDAO = new UsuarioDAO();
        //usuDAO.inserir(usu);
        
        //new UsuarioDAO().editar(usu);
        
        //new UsuarioDAO().excluir(1);
        
        /*ArrayList<Usuario> lstUsuario = new UsuarioDAO().getAllUsuarios();
        
        for (Usuario usuTmp : lstUsuario) {
            System.out.println(usuTmp.getUsuario());
        }*/

        boolean autenticado = new UsuarioDAO().autenticar("fabio", "321");
        if (autenticado) {
            System.out.println("Pode entrar");
        } else {
            System.out.println("SAIU FORA!!!!");
        }
    }
}
