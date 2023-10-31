package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.PerfilUsuario;

import java.text.ParseException;

public class PerfilUsuarioFakeDB extends BaseFakeDB<PerfilUsuario>{

    public PerfilUsuarioFakeDB() throws ParseException {
    }

    @Override
    protected void carregarDados() throws ParseException {
        this.tabela.add(new PerfilUsuario(1L,"ROLE_PROF"));
        this.tabela.add(new PerfilUsuario(2L, "ROLE_ALUNO"));
        this.tabela.add(new PerfilUsuario(3L, "ROLE_CONVIDADO"));
    }
}
