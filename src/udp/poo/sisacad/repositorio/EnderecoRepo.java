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
        int tamanho = this.dataset.size() - 1; // pega o tamanho da lista
        int proxID = this.dataset.get(tamanho).getId(); // busca o ID da ultima posicao da lista e armazena
        proxID++;
        endereco.setId(proxID);
        this.dataset.add(endereco); // add o endereco na lista do dataset após setar o seu no ID
        return endereco;
    }

    @Override
    public Endereco read(int id) {
        for (Endereco endereco : this.dataset) {
            if(endereco.getId() == id) {
                return endereco;
            }
        }
        return null;
    }

    @Override
    public Endereco update(Endereco endereco) {
        Endereco alvo = this.read(endereco.getId());
        alvo.setLogradouro(endereco.getLogradouro());
        alvo.setBairro(endereco.getBairro());
        alvo.setNum(endereco.getNum());
        alvo.setCep(endereco.getCep());
        alvo.setCidade(endereco.getCidade());
        alvo.setSiglaEstado(endereco.getSiglaEstado());
        return alvo;
    }

    @Override
    public Endereco delete(int id) {
        Endereco alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
