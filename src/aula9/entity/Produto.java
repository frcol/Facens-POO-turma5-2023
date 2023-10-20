
package aula9.entity;


public class Produto {
        private int id;
        private String nome;
        private int qtde;
        private double valor;

    public Produto() {
    }

        
    public Produto(int id, String nome, int qtde, double valor) {
        this.id = id;
        this.nome = nome;
        this.qtde = qtde;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
