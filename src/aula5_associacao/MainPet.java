package aula5_associacao;

import aula5.Exercicio1.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class MainPet {

    public static void main(String[] args) {
        String opt = "";
        Curso cur = null;
        
        // Curso
        int codigo, cargaHoraria;
        String nome;
       
        ArrayList<Curso> lstCursos = new ArrayList<>();
        Curso curAtual = null;
        
        while(!opt.equals("6")) { 
            opt = JOptionPane.showInputDialog("1- Criar Curso \n2- Criar Aluno\n 3- Remover Aluno\n 4- Mostrar Cursos \n 5- Mostrar Alunos do Curso\n 6- Sair");
            if (opt == null) {
                System.exit(0);
            }
                                      
            switch (opt) {
                case "1":
                    // Entrada do usuário
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária: "));
                    // atrinui valores ao objeto
                    cur = new Curso(codigo, nome, cargaHoraria);
                    lstCursos.add(cur);
                    
                    break;
                case "2":
                    curAtual = getCurso(lstCursos);
                    if (curAtual != null) {
                        String ra = JOptionPane.showInputDialog("RA: ");
                        String nomeAlu = JOptionPane.showInputDialog("Nome: ");
                        Aluno alu = new Aluno(ra, nomeAlu);
                        curAtual.inserirAluno(alu);
                        curAtual = null;
                    }
                    break;
                case "3":    
                    curAtual = getCurso(lstCursos);
                    if (curAtual != null) {
                        String ra = JOptionPane.showInputDialog("RA: ");
                        for (int x=0; x < curAtual.getLstAlunos().size(); x++) {
                            Aluno tmp = curAtual.getLstAlunos().get(x);
                            if (tmp.getRa().equals(ra)) {
                                curAtual.removerAluno(x);
                            }
                        }
                        curAtual = null;
                    }
                    break;
                case "4":
                    if (!lstCursos.isEmpty()) {
                        String msg = "";
                        for (Curso curso : lstCursos) {
                            msg += curso.imprimir()+ "\n--------------------\n";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "5":
                    curAtual = getCurso(lstCursos);
                    if (curAtual != null) {
                        JOptionPane.showMessageDialog(null, curAtual.imprimirCompleto());
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }
    
    public static Curso getCurso(ArrayList<Curso> lstCursos) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo do curso: "));
        for (Curso curso : lstCursos) {
            if (curso.getCodigo() == codigo) {
                return curso;
            }
        }
        
        return null;
    }
}
