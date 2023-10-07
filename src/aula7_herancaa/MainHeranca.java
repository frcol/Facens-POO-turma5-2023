package aula7_herancaa;

import java.util.ArrayList;

public class MainHeranca {
    public static void main(String[] args) {
        Professor prof = new Professor("Fabio","123","Rua humberto");
        prof.setCracha("34535");
        prof.setTipoVinculo('N');
        prof.setSalario(35000);
        
        Aluno alu = new Aluno();
        alu.setNome("Joao");
        alu.setCpf("234234");
        alu.setEndereco("Carlos botelho");
        alu.setRa("23423");
        alu.setNota1(5);
        alu.setNota2(7);
        
              
        ArrayList<Pessoa> lstPessoas = new ArrayList<>();
        lstPessoas.add(alu);
        lstPessoas.add(prof);
        
        for (Pessoa p : lstPessoas) {
            System.out.println(p.imprimir());
        }
    }
}
