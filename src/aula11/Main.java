package aula11;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        
        System.out.println(conta1.getTotalContas());
        
        System.out.println(conta2.getTotalContas());
        
        Conta conta3 = new Conta();
        System.out.println(conta1.getTotalContas());
        
        int num = Conta.getTotalContasStatic();
        System.out.println(num);
        
    }
}
