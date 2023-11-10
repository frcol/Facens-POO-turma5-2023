
package aula7_herancaa;


public class Cachorro extends Animal{

    private double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
    
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fala() {
        System.out.println("Auauauauuaauu");
    }
}
