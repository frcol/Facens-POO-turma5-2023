package aula3;

public class Aluno {
    private String nome;
    private String ra;
    private String curso;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

        
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String imprimir() {
        return "Nome: "+getNome()+
                "\nRA: "+getRa()+
                "\nCurso: "+getNome();
    }
}
