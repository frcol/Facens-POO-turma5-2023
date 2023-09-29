package aula5_associacao;

public class Pet {
    private String nome;
    private String raca;
    private int idade;

    public Pet(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    public String imprimir() {
        return "\n-------------"+
                "\n  Nome: "+nome+
                "\n  Raca: "+raca+
                "\n  Idade: "+idade;
    }
}
