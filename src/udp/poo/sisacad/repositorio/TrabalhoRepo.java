package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Trabalho;
import udp.poo.sisacad.fakedb.TrabalhoFakeDB;

import java.text.ParseException;

public class TrabalhoRepo extends BaseRepositorio<TrabalhoFakeDB, Trabalho>{

    public TrabalhoRepo() throws ParseException {
        this.db = new TrabalhoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Trabalho create(Trabalho instancia) {
        return null;
    }

    @Override
    public Trabalho read(int id) {
        for (Trabalho trabalho : this.dataset) {
            if(trabalho.getId() == id) {
                return trabalho;
            }
        }
        return null;
    }

    @Override
    public Trabalho update(Trabalho instancia) {
        return null;
    }

    @Override
    public Trabalho delete(int id) {
        return null;
    }
}
