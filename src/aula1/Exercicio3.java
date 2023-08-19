package aula1;

public class Exercicio3 {
    public static void main(String[] args) {
        int result =  contarCaractere("Antonio", 'o');
        System.out.println(result);
    }
    
    public static int contarCaractere(String texto, char caracter) {
        int contagem = 0;
        
        for (int i=0; i < texto.length(); i++) {
            if (texto.charAt(i) == caracter) {
                contagem++;
            }
        }
        
        return contagem;
    }
}
