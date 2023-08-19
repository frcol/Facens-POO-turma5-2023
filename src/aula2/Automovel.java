package aula2;

public class Automovel {
    private String marca;
    private String modelo;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    // ===============================
     public String imprimir() {
        String str ="\n==========================="+ 
                    "\nMarca: "+getMarca()+
                    "\nModelo: "+getModelo()+
                    "\nCor: "+getCor();
        
        return str;
    }
}
