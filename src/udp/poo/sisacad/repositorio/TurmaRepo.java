package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Turma;
import udp.poo.sisacad.fakedb.TurmaFakeDB;

import java.text.ParseException;

public class TurmaRepo extends BaseRepoCRUD<TurmaFakeDB, Turma>{

    public TurmaRepo() throws ParseException {
        this.db = new TurmaFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Turma create(Turma turma) {
        int tamanho = this.dataset.size() - 1; // pega o tamanho da lista
        Long proxID = this.dataset.get(tamanho).getId(); // busca o ID da ultima posicao da lista e armazena
        proxID++;
        turma.setId(proxID);
        this.dataset.add(turma); // add a turma na lista do dataset após setar o seu no ID
        return turma;
    }

    @Override
    public Turma read(Long id) {
        for (Turma turma : this.dataset) {
            if(turma.getId() == id) {
                return turma;
            }
        }
        return null;
    }

    @Override
    public Turma update(Turma turma) {
        Turma alvo = this.read(turma.getId());
        alvo.setAlunos(turma.getAlunos());
        alvo.setDisciplinas(turma.getDisciplinas());
        alvo.setCapacidadeMaxAlunos(turma.getCapacidadeMaxAlunos());
        alvo.setProfessores(turma.getProfessores());
        return alvo;
    }

    @Override
    public Turma delete(Long id) {
        Turma alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
