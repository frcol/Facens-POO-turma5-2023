
package aula10.ExercicioPessoa;


public class Aluno extends Pessoa{
    private String ra;
    private Disciplina disciplina;

    public Aluno() {
    }

    public Aluno(String nome, String cpf, String ra, Disciplina disciplina) {
        super(nome, cpf);
        this.ra = ra;
        this.disciplina = disciplina;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return  "\n### ALUNO ###"
                +super.toString()
                +"\nRA: "+ra
                +"\nDisciplina: "+disciplina.getNome();
    }
}
