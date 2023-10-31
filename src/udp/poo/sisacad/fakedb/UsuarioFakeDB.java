package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Usuario;

import java.text.ParseException;

public class UsuarioFakeDB extends BaseFakeDB<Usuario>{

    public UsuarioFakeDB() throws ParseException {
        super();
    }

    @Override
    protected void carregarDados() throws ParseException {
        Usuario usuario1 = new Usuario(1, "usuario1", "senha1", "usuario1@email.com", true, dateFormat.parse("31/10/2023"));
        this.tabela.add(usuario1);
        Usuario usuario2 = new Usuario(2, "usuario2", "senha2", "usuario2@email.com", true, dateFormat.parse("30/10/2023"));
        this.tabela.add(usuario2);
        Usuario usuario3 = new Usuario(3, "usuario3", "senha3", "usuario3@email.com", true, dateFormat.parse("30/10/2023"));
        this.tabela.add(usuario3);
        Usuario usuario4 = new Usuario(4, "usuario4", "senha4", "usuario4@email.com", true, dateFormat.parse("29/10/2023"));
        this.tabela.add(usuario4);
        Usuario usuario5 = new Usuario(5, "usuario5", "senha5", "usuario5@email.com", true, dateFormat.parse("29/10/2023"));
        this.tabela.add(usuario5);
    }
}
