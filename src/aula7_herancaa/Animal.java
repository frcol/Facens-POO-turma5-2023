package aula7_herancaa;


public class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
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
    
    
    public void fala() {
        System.out.println("Falando como ANIMAL comum");
    }
    
    public void movimenta() {
        System.out.println("Andando como ANIMAL comum");
    }
}
