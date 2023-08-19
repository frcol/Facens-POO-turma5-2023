package aula2;

public class MainPOO {
    public static void main(String[] args) {
        Aluno alu1 = new Aluno();
        alu1.setNome("Fabio");
        alu1.setCurso("ADS");
        alu1.setRa("11111111");
        
        System.out.println("ALuno: "+alu1.imprimir());
        
        Aluno alu2 = new Aluno();
        alu2.setNome("Joao");
        alu2.setCurso("Jogos");
        alu2.setRa("77777777");
        
        System.out.println("ALuno: "+alu2.imprimir());
        
        
        Automovel auto1 = new Automovel();
        auto1.setMarca("Wolkswagen");
        auto1.setModelo("Fusca");
        auto1.setCor("Azul");
        
        System.out.println(auto1.imprimir());
    }
}
