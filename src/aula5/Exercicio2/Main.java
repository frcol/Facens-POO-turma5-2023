package aula5.Exercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String opt = "";
        Pessoa pes = null;
        
        // Pessoa
        int codigo;
        String nome;
       
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        
        Pessoa pessoaAtual = null;
        Pessoa pessoaAtualB = null;
        
        while(!opt.equals("6")) { 
            opt = JOptionPane.showInputDialog("1- Criar Pessoa \n"
                                               +"2- Criar Automóvel\n"
                                               +"3- Transferir automóvel \n"
                                               +"4- Mostrar Pessoas \n "
                                               +"5- Mostrar Automovel da pessoa\n "
                                               +"6- Sair");
            if (opt == null) {
                System.exit(0);
            }
                                      
            switch (opt) { // CADASTRA PESSOA
                case "1":
                    // Entrada do usuário
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("codigo: "));
                    nome = JOptionPane.showInputDialog("Nome: ");

                    // atrinui valores ao objeto
                    pes = new Pessoa(codigo, nome);
                    lstPessoas.add(pes);
                    
                    break;
                case "2": // CADASTRA AUTOMOVEL PARA A PESSOA
                    pessoaAtual = getPessoa(lstPessoas);
                    
                    if (pessoaAtual != null) {
                        String marca = JOptionPane.showInputDialog("Marca: ");
                        String modelo = JOptionPane.showInputDialog("Modelo: ");
                        Automovel auto = new Automovel(marca, modelo);
                        pessoaAtual.inserirAutomovel(auto);
                    }
                    
                    break;
                case "3":  // TRASNFERIR AUTOMOVEL
                    pessoaAtual = getPessoa(lstPessoas); // pego pessoa A
                    pessoaAtualB = getPessoa(lstPessoas);// pego pessoa B
                    Automovel auto = null;
                    
                    if (pessoaAtual != null && pessoaAtualB != null) {
                        String modelo = JOptionPane.showInputDialog("Modelo do carro: "); 

                        // remove Auto da pessoaA
                        for (int x=0; x < pessoaAtual.getLstAutomoveis().size(); x++) {
                            Automovel tmp = pessoaAtual.getLstAutomoveis().get(x);
                            if (tmp.getModelo().equals(modelo)) {
                                pessoaAtual.removerAutomovel(x);
                                auto = tmp;
                            }
                        }
                        
                        pessoaAtualB.inserirAutomovel(auto);
                    }
                    break;
                case "4":
                    if (!lstPessoas.isEmpty()) {
                        String msg = "";
                        for (Pessoa pessoa : lstPessoas) {
                            msg += pessoa.imprimir()+ "\n--------------------\n";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "5":
                     pessoaAtual = getPessoa(lstPessoas);
                    if (pessoaAtual != null) {
                        JOptionPane.showMessageDialog(null, pessoaAtual.imprimirCompleto());
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                "Voce precisa cadastrar a Pessoa antes.", 
                                                "Cuidado...", 
                                                JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao Invalida", "Cuidado", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        } 
    }
    
    public static Pessoa getPessoa(ArrayList<Pessoa> lstPessoas) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Código da pessoa: "));
        
        for (Pessoa pessoa : lstPessoas) {
            if (pessoa.getCodigo() == codigo) {
                return pessoa;
            }
        }
        
        return null;
    }
}
