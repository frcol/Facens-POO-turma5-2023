package aula11.Exercicio;

public class FuncionarioHorista extends Funcionario{
    private int qtdeHoras;
    private double valorHora;

    public FuncionarioHorista() {
    }

    public FuncionarioHorista(int qtdeHoras, double valorHora, int cracha, String nome, String setor, String funcao) {
        super(cracha, nome, setor, funcao);
        this.qtdeHoras = qtdeHoras;
        this.valorHora = valorHora;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQtdeHoras() {
        return qtdeHoras;
    }

    public void setQtdeHoras(int qtdeHoras) {
        this.qtdeHoras = qtdeHoras;
    }

    @Override
    public double calcularSalario() {
        return qtdeHoras * valorHora;
    }

    @Override
    public String toString() {
        return "\n\n### HORISTA ###\n"+
                super.toString()+
                "\nQuantidade horas: "+qtdeHoras+
                "\nValor hora: "+valorHora; 
    }
    
    
}
