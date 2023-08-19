package aula2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String nome, ra, curso, opt = "";
        Aluno aluno = null;
        
        do {
            opt = JOptionPane.showInputDialog("1- Cadastrar \n2- Visualizar \n3- Sair");
            if (opt == null) { 
                System.exit(0); 
            }
            
            switch (opt) {
                case "1":
                    // cadastrar
                    nome = JOptionPane.showInputDialog("Nome:");
                    curso = JOptionPane.showInputDialog("Curso:");
                    ra = JOptionPane.showInputDialog("RA:");
                    
                    aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setCurso(curso);
                    aluno.setRa(ra);
                    
                    break;
                case "2":
                    // Visualizar
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, 
                                "Voce cadastrar um Aluno.");
                            
                        break;
                    }
                    
                    JOptionPane.showMessageDialog(null, aluno.imprimir());
                    break;
                case "3":
                    // Sair
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Opcao Invalida",
                            "Cuidado!!!",
                            JOptionPane.WARNING_MESSAGE);
            }
        } while(!opt.equals("3"));
         
    }
}
