package aula11.Exercicio;

import Aula2.Exercicio3.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String opt = "";
        Funcionario f = null;
        
        int cracha;
        String nome, setor, funcao;
        char tipoVinculo;
        float valorHora, salario, valorDesconto;
        int qtdeHora;
        
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<>();
        
        while(!opt.equals("3")) {
            opt = JOptionPane.showInputDialog("1- Cadastrar\n2- Consultar\n3- Sair");
            if (opt == null) {
                System.exit(0);
            }
        
            switch (opt) {
                case "1":
                    cracha = Integer.parseInt(JOptionPane.showInputDialog("Cracha:"));
                    nome = JOptionPane.showInputDialog("Nome:");
                    setor = JOptionPane.showInputDialog("Setor:");
                    funcao = JOptionPane.showInputDialog("Funcao:");
                    
                    tipoVinculo =  JOptionPane.showInputDialog("Tipo Vinculo:").toUpperCase().charAt(0);
                    
                    if (tipoVinculo == 'H') {
                        qtdeHora = Integer.parseInt(JOptionPane.showInputDialog("Quantidade Hora:"));
                        valorHora = Float.parseFloat(JOptionPane.showInputDialog("Valor Hora:"));
                        
                        FuncionarioHorista horista = new FuncionarioHorista(qtdeHora, valorHora, cracha, nome, setor, funcao);
                        lstFuncionarios.add(horista);
                    } else {
                        valorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Valor Desconto:"));
                        salario = Float.parseFloat(JOptionPane.showInputDialog("Salario: "));
                        
                        FuncionarioMensalista mensalista = new FuncionarioMensalista(salario, valorDesconto, cracha, nome, setor, funcao);
                        lstFuncionarios.add(mensalista);
                    }

                    break;
                case "2":
                    if (!lstFuncionarios.isEmpty()) {
                        String msg = "";
                        for (Funcionario func : lstFuncionarios) {
                            msg += func.toString();
                            msg += "\nSalario final: "+func.calcularSalario();
                        }
                        
                        JOptionPane.showMessageDialog(null, msg);
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar um Funcionario", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                 case "3":
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
