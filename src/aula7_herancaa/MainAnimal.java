package aula7_herancaa;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Xodo", 6);
                
        Gato cat = new Gato("Lili", 8);
                
        Jacare jac = new Jacare("Toto", 121);
        
        
        ArrayList<Animal> lstAnimais = new ArrayList<>();
        lstAnimais.add(jac);
        lstAnimais.add(dog);
        lstAnimais.add(cat);
        
        for (Animal ani : lstAnimais) {
            ani.fala();
        }
        
        Animal meuAnimal = dog;
        
        Animal ani1 = new Animal("Ozzy", 4);
        Cachorro cao = (Cachorro) ani1;
    }
}
