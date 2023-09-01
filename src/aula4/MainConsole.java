package aula4;

import javax.swing.JOptionPane;

public class MainConsole {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno("meuRA", "Fabio");
        Aluno aluno2 = new Aluno("Ra", "Fabio", 4,5,7,3);
       
        
        aluno.calcularMedia();
        aluno.calculaMedia(5, 4);
    }
}
