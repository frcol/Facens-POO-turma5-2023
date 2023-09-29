package aula5_associacao;

import java.util.ArrayList;


public class Tutor {
    private String nome;
    private String cpf;
    private ArrayList<Pet> lstPets;
    
    public Tutor() {
        lstPets = new ArrayList<>();
    }

    public Tutor(String nome, String cpf) {
        this();
        this.nome = nome;
        this.cpf = cpf;
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
    
    public void addPet(Pet pet) {
        lstPets.add(pet);
    }
    
    public void removePet(Pet pet) {
        lstPets.remove(pet);
    }
    
    public void removePet(int index) {
        lstPets.remove(index);
    }
    
    public void removePet(String nome) {
        for (Pet pet : lstPets) {
            if (pet.getNome().endsWith(nome)) {
                lstPets.remove(pet);
            }
        }
    }
    
    public String imprimir() {
        String str = "";
        str += "\nNome: "+nome+
                "\nCPF: "+cpf;
        
        for (Pet pet : lstPets) {
            str += pet.imprimir();
        }
        
        return str;
    }
}
