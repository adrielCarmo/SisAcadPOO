package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Endereco;
import udp.poo.sisacad.fakedb.EnderecoFakeDB;

import java.text.ParseException;

public class EnderecoRepo extends BaseRepositorio<EnderecoFakeDB, Endereco>{
    public EnderecoRepo() throws ParseException {
        this.db = new EnderecoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Endereco create(Endereco endereco) {
        return null;
    }

    @Override
    public Endereco read(int id) {
        return null;
    }

    @Override
    public Endereco update(Endereco endereco) {
        return null;
    }

    @Override
    public Endereco delete(int id) {
        return null;
    }
}
