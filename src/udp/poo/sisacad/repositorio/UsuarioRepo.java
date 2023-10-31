package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Usuario;
import udp.poo.sisacad.fakedb.UsuarioFakeDB;

import java.text.ParseException;

public class UsuarioRepo extends BaseRepoCRUD<UsuarioFakeDB, Usuario> {

    public UsuarioRepo() throws ParseException {
        this.db = new UsuarioFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Usuario create(Usuario usuario) {
        int tamanho = this.dataset.size() - 1; // pega o tamanho da lista
        Long proxID = this.dataset.get(tamanho).getId(); // busca o ID da ultima posicao da lista e armazena
        proxID++;
        usuario.setId(proxID);
        this.dataset.add(usuario); // add o user na lista do dataset após setar o seu no ID
        return usuario;
    }

    @Override
    public Usuario read(Long id) {
        for (Usuario usuario: this.dataset) {
            if(usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public Usuario update(Usuario usuario) {
        Usuario alvo = this.read(usuario.getId());
        alvo.setUsername(usuario.getUsername());
        alvo.setSenha(usuario.getSenha());
        alvo.setAtivo(usuario.isAtivo());
        alvo.setEmail(usuario.getEmail());
        alvo.setPerfilUsuario(usuario.getPerfilUsuario());
        alvo.setDataInsercao(usuario.getDataInsercao());
        return alvo;
    }

    @Override
    public Usuario delete(Long id) {
        Usuario alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
