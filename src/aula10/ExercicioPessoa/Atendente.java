
package aula10.ExercicioPessoa;


public class Atendente extends Funcionario{
    private String setor;
    private String funcao;

    public Atendente() {
    }

    public Atendente(String setor, String funcao, String nome, String cpf, int numeroCracha, double salario) {
        super(nome, cpf, numeroCracha, salario);
        this.setor = setor;
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    @Override
    public String toString() {
        return  "\n### ATENDENTE ###"
                +super.toString()
                +"\nSetor: "+setor
                +"\nFuncao: "+funcao;
    }

    @Override
    public void bonificacao() {
        setSalario(getSalario()*1.15);
    }  
}
