
package aula6.ac1;


public class Veterinario {
    private String nome;
    private String cpf;
    private String crmv;
    private int idade;
    private char genero;
    private double valorConsulta;

    public Veterinario() {
    }

    public Veterinario(String nome, String crmv) {
        this.nome = nome;
        this.crmv = crmv;
    }

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    
    public double getSalario(int qtdeConsultas) {
        return valorConsulta * qtdeConsultas;
    }
    
    public String imprimir() {
        return "\n\n======================="+
                "\nNome: "+nome+
                "\nCPF: "+cpf+
                "\nCRMV: "+crmv+
                "\nGenero: "+genero+
                "\nValor Consulta: "+valorConsulta;
    }
    
    public String imprimir(int qtdeConsultas) {
        String str = imprimir();
        
        str += "\nSalário: "+getSalario(qtdeConsultas);
        
        return str;
    }
}
