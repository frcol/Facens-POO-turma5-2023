package aula11.Exercicio;


public class FuncionarioMensalista extends Funcionario{
    private double salario;
    private double desconto;

    public FuncionarioMensalista() {
    }

    public FuncionarioMensalista(double salario, double desconto, int cracha, String nome, String setor, String funcao) {
        super(cracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario - (salario * (desconto/100));
    }

    @Override
    public String toString() {
        return "\n\n### MENSALISTA ###\n"+
                super.toString() +
                "\nSalario: "+salario+
                "\nDesconto: "+desconto;
    }
    
    
    
}
