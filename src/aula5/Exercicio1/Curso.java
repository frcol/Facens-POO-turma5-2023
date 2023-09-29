package aula5.Exercicio1;

import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private int cargaHoraria;
    private ArrayList<Aluno> lstAlunos;
    
    public Curso() {
        lstAlunos = new ArrayList<>();
    }
    
    public Curso(int codigo, String nome, int cargaHoraria) {
        this();
        this.codigo =  codigo;
        this.nome = nome;
        this.cargaHoraria =cargaHoraria;
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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getLstAlunos() {
        return lstAlunos;
    }

    // ==================================================
    public void inserirAluno(Aluno newAluno) {
        lstAlunos.add(newAluno);
    }
    
    public void removerAluno(int index) {
        lstAlunos.remove(index);
    }
    
    // sobrecarga - coloquei a mais
    public void removerAluno(Aluno aluno) {
        lstAlunos.remove(aluno);
    }
    // ---------------------------
    
    public String imprimir() {
        return "\n Codigo: "+codigo+
                "\n Nome: "+nome+
                "\n Carga horária: "+cargaHoraria;
    }
    
    public String imprimirCompleto() {
        String msg = imprimir() + "\n ### ALUNOS ###\n";
        for (Aluno aluno : lstAlunos) {
            msg += aluno.imprimir() + "\n";
        }
        
        return msg;
    }
}
