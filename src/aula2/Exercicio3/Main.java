package Aula2.Exercicio3;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        Funcionario f = null;
        
        int cracha;
        String nome;
        char tipoVinculo;
        float valorHora, qtdeHora, salario, valorDesconto;
        
        while(!opt.equals("4")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n 2- Consultar\n 3- Alterar\n 4- Sair");
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Cracha:"));
                    nome = JOptionPane.showInputDialog("Nome:");
                    tipoVinculo =  JOptionPane.showInputDialog("Tipo Vinculo:").toUpperCase().charAt(0);
                    valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Valor Desconto:"));
                    
                    f = new Funcionario();
                    f.setCracha(cracha);
                    f.setNome(nome);
                    f.setTipoVinculo(tipoVinculo);
                    f.setValorDesconto(valorDesconto);
                    
                    if (f.getTipoVinculo() == 'H') {
                        qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade Hora:"));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora:"));
                        
                        f.setValorHora(valorHora);
                        f.setQtdeHora(qtdeHora);
                        salario = f.calcularSalario();
                    } else {
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Salario: "));
                    }
                    
                    f.setSalario(salario);
                    break;
                case "2":
                    if (f != null) {
                        JOptionPane.showMessageDialog(null, f.imprimir() );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "3":
                    if (f == null) {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar o Funcionário antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    
                    if (f.getTipoVinculo() == 'H') {
                        qtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Quantidade Hora:"));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora:"));
                        
                        f.setValorHora(valorHora);
                        f.setQtdeHora(qtdeHora);
                        salario = f.calcularSalario();
                    } else {
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Salario: "));
                    }
                    
                    f.setSalario(salario);
                    break;
                 case "4":
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
