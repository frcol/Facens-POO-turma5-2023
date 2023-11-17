package aula11.Exercicio;

public abstract class Funcionario {
    private int cracha;
    private String nome;
    private String setor;
    private String funcao;

    public Funcionario() {
    }

    public Funcionario(int cracha, String nome, String setor, String funcao) {
        this.cracha = cracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }


    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
   
    // ====================================================
    public abstract double calcularSalario();
    
    @Override
    public String toString() {
        return "Cracha: "+cracha
                +"\nNome:"+nome
                +"\nSetor: "+setor
                +"\nFuncao: "+funcao;
    }

}
