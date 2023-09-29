package aula5.Exercicio2;

import java.util.ArrayList;

public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> lstAutomoveis;

    public Pessoa() {
        lstAutomoveis = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public ArrayList<Automovel> getLstAutomoveis() {
        return lstAutomoveis;
    }
    
    public void inserirAutomovel(Automovel automovel) {
        getLstAutomoveis().add(automovel);
    }
 
    public void removerAutomovel(int index) {
        getLstAutomoveis().remove(index);
    }
    
    public String imprimir() {
        return "\n Código: "+codigo+
                "\n Nome: "+nome;
    }
    
    public String imprimirCompleto() {
        String msg = imprimir()+"\n#############\n";
        
        for (Automovel auto : getLstAutomoveis()) {
            msg += auto.imprimir()+"\n";
        }
        
        return msg;
    } 

}
