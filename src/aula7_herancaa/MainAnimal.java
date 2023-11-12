package aula7_herancaa;

import java.util.ArrayList;

public class MainAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal("Xofo", 3);
        
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
    }
}
