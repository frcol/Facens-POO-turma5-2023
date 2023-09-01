
package Aula2.Exercicio2;

import aula2.Exercicio2.Aluno;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        String opt = "";
        
        Aluno aluno = null;
        String ra, nome;
        float ac1, ac2, ag, af;
        
      
        while(!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar \n2- Mostrar \n3- Sair");
            if (opt == null) {
                System.exit(0);
            }
            
            switch(opt){
                case "1":
                    ra = JOptionPane.showInputDialog("RA:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    ac1 = Float.parseFloat(JOptionPane.showInputDialog("AC1:"));
                    ac2 = Float.parseFloat(JOptionPane.showInputDialog("AC2:"));
                    ag = Float.parseFloat(JOptionPane.showInputDialog("AG:"));
                    af = Float.parseFloat(JOptionPane.showInputDialog("AF:"));
                    
                    aluno = new Aluno();
                    aluno.setRa(ra);
                    aluno.setNome(nome);
                    aluno.setAc1(ac1);
                    aluno.setAc2(ac2);
                    aluno.setAg(ag);
                    aluno.setAf(af);
                    break;
                case "2":
                    if (aluno == null) {
                        JOptionPane.showMessageDialog(null, "Aluno não foi cadastrado!", "Alerta", JOptionPane.WARNING_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, aluno.imprimir());
                    }
                    break;
                case "3":
                    break;
            }
        }
    }
}
