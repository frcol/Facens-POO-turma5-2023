
package aula7_herancaa;


public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fala() {
        System.out.println("Auauauauuaauu");
    }
}
