package aula3.Exercicio1;

import aula2.Exercicio1.*;

public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa(String cpf, String nome, char sexo, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String imprimir() {
        return "CPF: "+getCpf()+
                "\nNome: "+getNome()+
                "\nSexo: "+getSexo()+
                "\nIdade: "+getIdade();
    }
}
