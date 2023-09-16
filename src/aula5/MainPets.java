package aula5;

import java.util.ArrayList;

public class MainPets {
    public static void main(String[] args) {
        
        ArrayList<Tutor> lstTutores = new ArrayList<>();
        
        Tutor tu = new Tutor("Fabio", "123");
        lstTutores.add(tu);
        
        Pet pet1 = new Pet("Xodo", "VR", 8);
        Pet pet2 = new Pet("Stefanni", "Lhasa", 16);
        
        tu.addPet(pet1);
        tu.addPet(pet2);
        
        tu.removePet("Xodo");
        
        System.out.println(tu.imprimir());
    }
}
