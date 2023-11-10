
package aula10.ExercicioPessoa;

import java.util.ArrayList;


public class Disciplina {
    int codigo;
    String nome;
    ArrayList<Aluno> alunos;

    public Disciplina() {
        alunos = new ArrayList<>();
    }

    public Disciplina(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void removeAluno(Aluno aluno) {
        alunos.remove(aluno);
    }
    
    public String toString() {
        String str = "";
        for (Aluno aluno : alunos){
            str += "\n                "+aluno.getNome();
        }
        return "\nCodigo: "+codigo
                +"\nNome: "+nome
                +"\nAlunos: "+str;
    }
}
