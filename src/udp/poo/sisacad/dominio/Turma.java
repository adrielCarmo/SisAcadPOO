package udp.poo.sisacad.dominio;

import java.util.ArrayList;

public class Turma extends BaseIdentificador implements IImpressao{
    private int capMaxAlunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;

    public Turma() {
    }

    public Turma(int id, int capMaxAlunos, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores, ArrayList<Aluno> alunos) {
        super(id);
        this.capMaxAlunos = capMaxAlunos;
        this.disciplinas = disciplinas;
        this.professores = professores;
        this.alunos = alunos;
    }

    public int getCapMaxAlunos() {
        return capMaxAlunos;
    }

    public void setCapMaxAlunos(int capMaxAlunos) {
        this.capMaxAlunos = capMaxAlunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public void imprimir() {
        System.out.println("ID da Turma:" + this.getId());
        System.out.println("Capacidade Máxima de Alunos: " + this.getCapMaxAlunos());
        System.out.println("Disciplina(as): " + this.getDisciplinas());
        System.out.println("Professor(es): " + this.getProfessores());
        System.out.println("Quantidade de Alunos na Turma: " + this.getAlunos().size());
    }
}
