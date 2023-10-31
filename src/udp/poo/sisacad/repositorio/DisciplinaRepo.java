package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Disciplina;
import udp.poo.sisacad.fakedb.DisciplinaFakeDB;

import java.text.ParseException;

public class DisciplinaRepo extends BaseRepositorio<DisciplinaFakeDB, Disciplina>{

    public DisciplinaRepo() throws ParseException {
        this.db = new DisciplinaFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Disciplina create(Disciplina instancia) {
        return null;
    }

    @Override
    public Disciplina read(int id) {
        for (Disciplina disciplina : this.dataset) {
            if(disciplina.getId() == id) {
                return disciplina;
            }
        }
        return null;
    }

    @Override
    public Disciplina update(Disciplina instancia) {
        return null;
    }

    @Override
    public Disciplina delete(int id) {
        return null;
    }
}
