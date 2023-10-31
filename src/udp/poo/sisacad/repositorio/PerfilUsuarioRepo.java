package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.PerfilUsuario;
import udp.poo.sisacad.fakedb.PerfilUsuarioFakeDB;

import java.text.ParseException;

public class PerfilUsuarioRepo extends BaseRepoCRUD<PerfilUsuarioFakeDB, PerfilUsuario>{
    public PerfilUsuarioRepo() throws ParseException {
        this.db = new PerfilUsuarioFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public PerfilUsuario create(PerfilUsuario perfilUsuario) {
        int tamanho = this.dataset.size() - 1; // pega o tamanho da lista
        Long proxID = this.dataset.get(tamanho).getId(); // busca o ID da ultima posicao da lista e armazena
        proxID++;
        perfilUsuario.setId(proxID);
        this.dataset.add(perfilUsuario); // add o perfil na lista do dataset após setar o seu no ID
        return perfilUsuario;
    }

    @Override
    public PerfilUsuario read(Long id) {
        for (PerfilUsuario perfilUsuario : this.dataset) {
            if(perfilUsuario.getId() == id) {
                return perfilUsuario;
            }
        }
        return null;
    }

    @Override
    public PerfilUsuario update(PerfilUsuario perfilUsuario) {
        PerfilUsuario alvo = this.read(perfilUsuario.getId());
        alvo.setAutorizacao(perfilUsuario.getAutorizacao());
        return alvo;
    }

    @Override
    public PerfilUsuario delete(Long id) {
        PerfilUsuario alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
