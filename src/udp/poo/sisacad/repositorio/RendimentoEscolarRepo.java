package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.RendimentoEscolar;
import udp.poo.sisacad.fakedb.RendimentoEscolarFakeDB;

import java.text.ParseException;

public class RendimentoEscolarRepo extends BaseRepositorio<RendimentoEscolarFakeDB, RendimentoEscolar>{

    public RendimentoEscolarRepo() throws ParseException {
        this.db = new RendimentoEscolarFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public RendimentoEscolar create(RendimentoEscolar rendEscolar) {
        return null;
    }

    @Override
    public RendimentoEscolar read(int id) {
        for (RendimentoEscolar rendEscolar : this.dataset) {
            if(rendEscolar.getId() == id) {
                return rendEscolar;
            }
        }
        return null;
    }

    @Override
    public RendimentoEscolar update(RendimentoEscolar rendEscolar) {
        return null;
    }

    @Override
    public RendimentoEscolar delete(int id) {
        RendimentoEscolar alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
