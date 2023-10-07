
package aula7_herancaa;


public class Gato extends Animal{

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fala() {
        System.out.println("Miauuuuuuuuu"); 
    }
    
    
}
