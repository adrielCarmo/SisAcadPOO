package udp.poo.sisacad.dominio;

import java.util.ArrayList;

public class Turma extends BaseIdentificador {
    
    private int capacidadeMaxAlunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    public Turma(long id) {
        this.setId(id);
    }

    public Turma(long id, int capacidadeMaxAlunos, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos,
            ArrayList<Professor> professores) {
        super(id);
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
        this.disciplinas = disciplinas;
        this.alunos = alunos;
        this.professores = professores;

    }

    public int getCapacidadeMaxAlunos() {
        return capacidadeMaxAlunos;
    }

    public void setCapacidadeMaxAlunos(int capacidadeMaxAlunos) {
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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