package aula1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        String op;

        while (true) {
            System.out.println("Operador");
            op = scan.next();
            
            if (op.equals("s")) {
                System.exit(0);
            }

            System.out.println("Numero 1");
            num1 = scan.nextInt();
            System.out.println("Numero 2");
            num2 = scan.nextInt();
            
            int result = Calcula(num1, num2, op);

            System.out.println("Resultado: " + result);
        }   
    }

    public static int Calcula(int num1, int num2, String operador) {
        int resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
        }

        return resultado;
    }

}
