package aula1;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        int idade = 23;
        String nome = "Joao Pedro";
        
        int resultado = idade + 10;
        
        if (resultado == 33) {
            // > < >= <= !=
            System.out.println("Idade = "+resultado);
        }
        else if(resultado > 70 && true) {
            // && || !
            System.out.println("Aposentado");
        } 
        else {
            System.out.println("Idade nao permitida");
        }   
        
        idade++;

        
        
        switch (idade) {
            case 1:
                System.out.println("Numero 1");
                break;
            case 2:
                System.out.println("Numero 2");
                break;
            default:
                System.out.println("Se nao entrar nos outros, entra aqui");
        }
        
        
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }
        
        int i = 5;
        while(i < 5) {
            System.out.println(i);
            i++;
        }
        
        do {
            System.out.println(i);
            i++;
        } while(i < 5);
        
        
        Scanner scan = new Scanner(System.in);
        String sobreNome = scan.nextLine();
        
        int[] idades = {3,5,6};
        
    }  
}
