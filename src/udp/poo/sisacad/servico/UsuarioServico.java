package udp.poo.sisacad.servico;

import udp.poo.sisacad.dominio.Usuario;
import udp.poo.sisacad.repositorio.UsuarioRepo;

import java.text.ParseException;
import java.util.ArrayList;

public class UsuarioServico extends BaseServico<UsuarioRepo, Usuario>{
    public UsuarioServico() throws ParseException {
        this.repo = new UsuarioRepo();
    }

    @Override
    public Usuario inserir(Usuario tupla) {
        return this.repo.create(tupla);
    }

    @Override
    public Usuario obter(int id) {
        return this.repo.read(id);
    }

    @Override
    public ArrayList<Usuario> listarTudo() {
        return this.repo.readAll();
    }

    @Override
    public Usuario atualizar(Usuario tupla) {
        return this.repo.update(tupla);
    }

    @Override
    public Usuario excluir(int id) {
        return this.repo.delete(id);
    }
}
