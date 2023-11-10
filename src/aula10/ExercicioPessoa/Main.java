package aula10.ExercicioPessoa;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    static ArrayList<Pessoa> lstPessoas = new ArrayList<>();
    static ArrayList<Disciplina> lstDisciplinas = new ArrayList<>();

    public static void main(String[] args) {
        String opcao;
        String nome = "";
        String cpf = "";
        int cracha=0;
        double salario=0;
        
        do {
            opcao = JOptionPane.showInputDialog(
                      "1- Inserir Disciplina\n"
                    + "2- Inserir Professor\n"
                    + "3- Inserir Atendente\n"
                    + "4- Inserir Aluno\n"
                    + "5- Adicionar Disciplina ao Professor\n"
                    + "6- Mostrar Pessoas\n"
                    + "7- Mostrar Disciplinas\n"
                    + "8- Aplicar bonificação\n"
                    + "9- Sair"
            );

            if (opcao == null) {
                System.exit(0);
            }
            
            if (opcao.equals("2") || opcao.equals("3") || opcao.equals("4")) {
                nome = JOptionPane.showInputDialog("Digite o nome:");
                cpf = JOptionPane.showInputDialog("Digite o CPF:");
            }
            
            if (opcao.equals("2") || opcao.equals("3")) {
                cracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do crachá:"));
                salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário:"));
            }
            
            switch (opcao) {
                case "1":
                    // Inserir Disciplina
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Disciplina:"));
                    String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina:");
                    Disciplina disciplina = new Disciplina(codigo, nomeDisciplina);
                    lstDisciplinas.add(disciplina);
                    break;
                case "2":
                    // Inserir Professor
                    String urlLattes = JOptionPane.showInputDialog("Digite a URL Lattes do Professor:");
                    Professor profTmp = new Professor(nome, cpf, cracha, salario, urlLattes);
                    lstPessoas.add(profTmp);
                    break;
                case "3":
                    // Inserir Atendente
                    String setor = JOptionPane.showInputDialog("Digite o setor do Atendente:");
                    String funcao = JOptionPane.showInputDialog("Digite a função do Atendente:");
                    Atendente atendTmp = new Atendente(setor, funcao, nome, cpf, cracha, salario);
                    
                    lstPessoas.add(atendTmp);
                    break;
                case "4":
                    // Inserir Aluno
                    
                    String ra = JOptionPane.showInputDialog("Digite o RA do Aluno:");
                    
                    int codigoDisc = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo da Disciplina do Aluno:\n"+getDisciplinas()));
                    
                    Disciplina disciplinaAluno = null;
                    for (Disciplina disc : lstDisciplinas) {
                        if (disc.getCodigo() == codigoDisc) {
                            disciplinaAluno = disc;
                            break;
                        }
                    }
                    Aluno aluTmp = new Aluno(nome, cpf, ra, disciplinaAluno);
                    
                    lstPessoas.add(aluTmp);
                    disciplinaAluno.addAluno(aluTmp);
                    break;
                case "5":
                    // Adicionar Disciplina ao Professor
                    int codigoDisciplina = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Disciplina:\n"+getDisciplinas()));
                    Disciplina disciplinaAdd = null;
                    for (Disciplina disc : lstDisciplinas) {
                        if (disc.getCodigo() == codigoDisciplina) {
                            disciplinaAdd = disc;
                            break;
                        }
                    }
                    if (disciplinaAdd == null) {
                        JOptionPane.showMessageDialog(null, "Disciplina não foi encontrada.");
                        continue;
                    }
                    
                    int crachaProfessorAdd = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do crachá do Professor:\n"+getFuncionarios(Professor.class)));
                    Professor professorAdd = null;
                    for (Pessoa pessoa : lstPessoas) {
                        if (pessoa instanceof Professor && ((Professor) pessoa).getNumeroCracha() == crachaProfessorAdd) {
                            professorAdd = (Professor) pessoa;
                            break;
                        }
                    }
                    if (professorAdd == null) {
                        JOptionPane.showMessageDialog(null, "Professor não foi encontrado.");
                        continue;
                    }
                    
                    professorAdd.addDisciplina(disciplinaAdd);
                    JOptionPane.showMessageDialog(null, "Realacionamento feito com sucesso");
                    break;
                case "6":
                    // Mostrar Pessoas
                    String pessoasInfo = "";
                    for (Pessoa pessoa : lstPessoas) {
                        pessoasInfo += pessoa.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Pessoas:\n" + pessoasInfo);
                    break;
                case "7":
                    // Mostrar Disciplinas
                    String disciplinasInfo = "";
                    for (Disciplina disc : lstDisciplinas) {
                        disciplinasInfo += disc.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, "Disciplinas:\n" + disciplinasInfo);
                    break;
                case "8":
                    // Aplicar bonificação
                    int crachaFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do crachá do Funcionário:\n"+getFuncionarios(Funcionario.class)));

                    for (Pessoa pessoa : lstPessoas) {
                        if (pessoa instanceof Funcionario && ((Funcionario) pessoa).getNumeroCracha() == crachaFuncionario) {
                            ((Funcionario) pessoa).bonificacao(); // Polimorfismo
                            JOptionPane.showMessageDialog(null, "Bonificação aplicada com sucesso!");
                            break;
                        }
                    }
                    break;
                case "9":
                    // Sair
                    JOptionPane.showMessageDialog(null, "Saindo do programa. Até mais!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                    break;
            }
        } while (!opcao.equals("9"));
    }
    
    private static String getDisciplinas() {
        String str="";
        for (Disciplina dic : lstDisciplinas) {
            str += "["+dic.getCodigo()+"] - "+dic.getNome()+"\n";
        }
        
        return str;
    }
    
    private static <T> String getFuncionarios(Class<T> tipoDaClasse) {
       String str = "";
        for (Pessoa pessoa : lstPessoas) {
            if (tipoDaClasse.isInstance(pessoa)) {
                T funcionario = tipoDaClasse.cast(pessoa);

                Funcionario func = (Funcionario) funcionario;
                str += "[" + func.getNumeroCracha() + "] - " + func.getNome() + "\n";
  
            }
        }

    return str;
    }
}
