package aula3.Exercicio3;

import aula2.Exercicio3.*;

public class Funcionario {
    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    // COntrutor HOrista
    public Funcionario(int cracha, String nome, char tipoVinculo, float valorHora, float qtdeHora, float valorDesconto) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
        this.valorHora = valorHora;
        this.qtdeHora = qtdeHora;
        this.salario = calcularSalario();
        this.valorDesconto = valorDesconto;
    }    
    
// COntrutor Normal
    public Funcionario(int cracha, String nome, char tipoVinculo, float salario, float valorDesconto) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
        this.valorDesconto = valorDesconto;
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

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    // ====================================================
    public float calcularSalario(){
        return valorHora * qtdeHora;
    }
    
    public float calcularValorReceber() {
        return salario - valorDesconto;
    }
    
    public String imprimir() {
        return "Crachá¡: "+cracha
                +"\nNome:"+nome
                +"\nTipo vínculo: "+tipoVinculo
                +"\nSalário: "+salario
                +"\nDesconto: "+valorDesconto
                +"\nValor a receber: "+calcularValorReceber();
    }
}
