package aula1;

public class Exercicio4 {
    public static void main(String[] args) {
        System.out.printf("Temperatura: %.2f\n", celsiusParaFahrenheit(36.6));
    }
    
    public static double celsiusParaFahrenheit(double tempCelsius) {
        double resultado = tempCelsius * 9/5 + 32;
        
        return resultado;
    }
}
