package aula10;

import aula7_herancaa.Animal;
import aula7_herancaa.Cachorro;
import aula7_herancaa.Gato;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Xodo", 10);
    Gato cat = new Gato("Lili", 5);
    
        ArrayList<Animal> lstAnimais = new ArrayList<>();
        lstAnimais.add(cat);
        lstAnimais.add(dog);
        
        for (Animal animal : lstAnimais) {
              if (animal instanceof Cachorro) {
                ((Cachorro)animal).fala();
            }
        }
            
    }  
}
