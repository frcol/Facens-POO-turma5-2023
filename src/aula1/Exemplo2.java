package aula1;

public class Exemplo2 {
    public static void main(String[] args) {

       int resultado = Calcula(1000, 323);
       
       System.out.println("Resultado: "+resultado);
    }
    
    public static int Calcula(int x, int y) {
       int resultado = x + y;
       
       return resultado;
    } 
}
