package aula3.Exemplo1;

public class Pessoa {
    private String nome;
    private String cpf;
    private String carteiraDeMotorista;

    public Pessoa(String nome, String cpf, String carteiraDeMotorista) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiraDeMotorista = carteiraDeMotorista;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }

    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }
    
    public String imprimir() {
        return "Nome: "+getNome()+
                "\nCPF: "+getCpf()+
                "\nCArteira: "+getCarteiraDeMotorista();
    }
}
