package udp.poo.sisacad.dominio;

import java.util.ArrayList;

public class Turma extends BaseIdentificador {
    
    private int capacidadeMaxAlunos;
    private Disciplina disciplina;
    private ArrayList <Aluno> alunos;
    private ArrayList <Professor> professores;

    public Turma() {
    }

    public Turma(long id, int capacidadeMaxAlunos, Disciplina disciplina, ArrayList<Aluno> alunos,
            ArrayList<Professor> professores) {
        super(id);
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
        this.disciplina = disciplina;
        this.alunos = alunos;
        this.professores = professores;
    }

    public int getCapacidadeMaxAlunos() {
        return capacidadeMaxAlunos;
    }

    public void setCapacidadeMaxAlunos(int capacidadeMaxAlunos) {
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

}