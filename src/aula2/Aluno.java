package aula2;

public class Aluno {
    private String nome;
    private String curso;
    private String ra;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String value) {
        this.nome = value;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    //==============================================
    public String imprimir() {
        String str = "\nNome: "+getNome()+
                    "\nCurso: "+getCurso()+
                    "\nRA: "+getRa();
        
        return str;
    }
}
