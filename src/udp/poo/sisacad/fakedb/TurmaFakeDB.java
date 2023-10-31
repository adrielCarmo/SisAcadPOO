package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.dominio.Disciplina;
import udp.poo.sisacad.dominio.Professor;
import udp.poo.sisacad.dominio.Turma;

import java.text.ParseException;
import java.util.ArrayList;

public class TurmaFakeDB extends BaseFakeDB<Turma>{
    private final DisciplinaFakeDB discFakeDB;
    private final AlunoFakeDB alunoFakeDB;
    private final ProfessorFakeDB professorFakeDB;
    public TurmaFakeDB() throws ParseException {
        super();
        discFakeDB = new DisciplinaFakeDB();
        alunoFakeDB = new AlunoFakeDB();
        professorFakeDB = new ProfessorFakeDB();
    }

    public ArrayList<Disciplina> queryDisciplina(int idTurma){
        ArrayList<Disciplina> disciplinasTurma = new ArrayList<>();
        if(idTurma == 1) {
            disciplinasTurma.add(discFakeDB.getTabela().get(1));
            disciplinasTurma.add(discFakeDB.getTabela().get(2));
            disciplinasTurma.add(discFakeDB.getTabela().get(3));
        } else if(idTurma == 2){
            disciplinasTurma.add(discFakeDB.getTabela().get(4));
            disciplinasTurma.add(discFakeDB.getTabela().get(5));
            disciplinasTurma.add(discFakeDB.getTabela().get(6));
        } else {
            disciplinasTurma.add(discFakeDB.getTabela().get(7));
            disciplinasTurma.add(discFakeDB.getTabela().get(8));
            disciplinasTurma.add(discFakeDB.getTabela().get(9));
        }
        return disciplinasTurma;
    }

    public ArrayList<Aluno> queryAluno(int idTurma) {
        ArrayList<Aluno> alunosTurma = new ArrayList<>();

        for (Aluno aluno : alunoFakeDB.getTabela()) {
            if(aluno.getTurma().getId() == idTurma) {
                alunosTurma.add(aluno);
            }
        }
        return alunosTurma;
    }

    public ArrayList<Professor> queryProfessor(int idTurma) {
        ArrayList<Professor> professoresTurma = new ArrayList<>();

        if(idTurma == 1) {
            professoresTurma.add(professorFakeDB.getTabela().get(1));
            professoresTurma.add(professorFakeDB.getTabela().get(2));
        } else if(idTurma == 2){
            professoresTurma.add(professorFakeDB.getTabela().get(3));
            professoresTurma.add(professorFakeDB.getTabela().get(4));
        } else {
            professoresTurma.add(professorFakeDB.getTabela().get(5));
        }
        return professoresTurma;
    }

    @Override
    protected void carregarDados() throws ParseException {
        Turma turma1 = new Turma(1, 30, queryDisciplina(1), queryProfessor(1),queryAluno(1));
        this.tabela.add(turma1);
        Turma turma2 = new Turma(2, 50, queryDisciplina(2), queryProfessor(2),queryAluno(2));
        this.tabela.add(turma2);
        Turma turma3 = new Turma(3, 60, queryDisciplina(3), queryProfessor(3),queryAluno(3));
        this.tabela.add(turma3);
    }
}
