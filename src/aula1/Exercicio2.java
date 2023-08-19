package aula1;

public class Exercicio2 {
    public static void main(String[] args) {
        if (ehPar(2)) {
            System.out.println("O número é par");
        }
    }
    
    public static boolean ehPar(int numero) {
        boolean result = numero % 2 == 0;
        
        return result;
    }
}
