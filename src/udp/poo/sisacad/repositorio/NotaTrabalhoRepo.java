package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.NotaTrabalho;
import udp.poo.sisacad.fakedb.NotaTrabalhoFakeDB;

import java.text.ParseException;

public class NotaTrabalhoRepo extends BaseRepositorio<NotaTrabalhoFakeDB, NotaTrabalho>{
    public NotaTrabalhoRepo() throws ParseException {
        this.db = new NotaTrabalhoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public NotaTrabalho create(NotaTrabalho notaTrab) {
        return null;
    }

    @Override
    public NotaTrabalho read(int id) {
        for (NotaTrabalho notaTrabalho : this.dataset) {
            if(notaTrabalho.getId() == id) {
                return notaTrabalho;
            }
        }
        return null;
    }

    @Override
    public NotaTrabalho update(NotaTrabalho notaTrab) {
        return null;
    }

    @Override
    public NotaTrabalho delete(int id) {
        NotaTrabalho alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
