
package aula3.Exercicio2;


public class Aluno {
    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public Aluno(String ra, String nome, float ac1, float ac2, float ag, float af) {
        this.ra = ra;
        this.nome = nome;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.ag = ag;
        this.af = af;
    }

    
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }
    
    //==========================================================
    public float calcularMedia(){
        return (ac1 * 0.15f) + (ac2 * 0.30f) +(ag * 0.10f) +(af * 0.45f);
    }
    
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else { 
            return "Reprovado";
        }
    }
    
    public String imprimir() {
        String result = "RA:"+this.getRa()
                +"\nNome: "+this.getNome()
                +"\nAC1: "+this.getAc1()
                +"\nAC2: "+this.getAc2()
                +"\nAG: "+this.getAg()
                +"\nAF: "+this.getAf()
                +"\n --------------------------"
                +"\nMédia: %.2f"
                +"\nSituação: "+this.verificarAprovacao();
        
        return String.format(result, this.calcularMedia());
    }
}
