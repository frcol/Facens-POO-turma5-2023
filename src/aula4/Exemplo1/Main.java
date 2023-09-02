package aula4.Exemplo1;

import aula2.Exercicio1.*;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        
        Pessoa p = null;
        
        String cpf, nome;
        char sexo;
        int idade;
        
        while(!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n 2- Consultar\n 3- Sair");
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    cpf = JOptionPane.showInputDialog("CPF:");
                    nome = JOptionPane.showInputDialog("Nome:");
                    sexo = JOptionPane.showInputDialog("Sexo:").charAt(0);
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
                    
                    p = new Pessoa();
                    p.setCpf(cpf);
                    p.setNome(nome);
                    p.setSexo(sexo);
                    p.setIdade(idade);
                    
                    break;
                case "2":
                    if (p != null) {
                        JOptionPane.showMessageDialog(null, p.imprimir() );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Volte sempre!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                                                "Opcao Invalida", 
                                                "Ops...deu errado!",
                                                JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
        
    }
}
