
package aula10.ExercicioPessoa;

import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class Professor extends Funcionario {
    String urlLatter;
    ArrayList<Disciplina> disciplinas;

    public Professor() {
        disciplinas = new ArrayList<>();
    }

    public Professor(String nome, String cpf, int numeroCracha, double salario, String urlLatter) {
        super(nome, cpf, numeroCracha, salario);
        disciplinas = new ArrayList<>();
        this.urlLatter = urlLatter;
    }

    public String getUrlLatter() {
        return urlLatter;
    }

    public void setUrlLatter(String urlLatter) {
        this.urlLatter = urlLatter;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    
    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }
    
    @Override
    public String toString() {
        String str = "";
        for (Disciplina disciplina : disciplinas){
            str += "\n                "+disciplina.getNome();
        }
        return  "\n### PROFESSOR ###"
                +super.toString()
                +"\nURL Lattes: "+urlLatter
                +"\nDisciplinas: "+str;
    }

    @Override
    public void bonificacao() {
        setSalario(getSalario()*2);
    }
    
    
}
