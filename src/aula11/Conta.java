
package aula11;

public class Conta {
    private static int totalContas;

    public Conta() {
        totalContas++;
    }
    public int getTotalContas() {
        return totalContas;
    }
    public void setTotalContas(int totalContas) {
        this.totalContas = totalContas;
    } 
    
    public static int getTotalContasStatic() {
        return totalContas;
    }
}
