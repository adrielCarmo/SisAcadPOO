package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Usuario;

import java.time.LocalDate;

public class UsuarioFakeDB extends BaseFakeDB<Usuario>{

    public UsuarioFakeDB(){
        super();
    }

    @Override
    protected void carregarDados() {
        Usuario usuario1 = new Usuario(1, "usuario1", "senha1", "usuario1@email.com", true, LocalDate.of(2023, 10, 31));
        this.tabela.add(usuario1);
        Usuario usuario2 = new Usuario(2, "usuario2", "senha2", "usuario2@email.com", true, LocalDate.of(2023, 10, 30));
        this.tabela.add(usuario2);
        Usuario usuario3 = new Usuario(3, "usuario3", "senha3", "usuario3@email.com", true, LocalDate.of(2023, 10, 30));
        this.tabela.add(usuario3);
        Usuario usuario4 = new Usuario(4, "usuario4", "senha4", "usuario4@email.com", true, LocalDate.of(2023, 10, 29));
        this.tabela.add(usuario4);
        Usuario usuario5 = new Usuario(5, "usuario5", "senha5", "usuario5@email.com", true, LocalDate.of(2023, 10, 29));
        this.tabela.add(usuario5);
        Usuario usuario6 = new Usuario(6, "usuario6", "senha6", "usuario1@email.com", true, LocalDate.of(2023, 10, 31));
        this.tabela.add(usuario6);
        Usuario usuario7 = new Usuario(7, "usuario7", "senha7", "usuario12@email.com", true, LocalDate.of(2023, 10, 31));
        this.tabela.add(usuario7);
        Usuario usuario8 = new Usuario(8, "usuario8", "senha8", "usuario13@email.com", true, LocalDate.of(2023, 10, 31));
        this.tabela.add(usuario8);
        Usuario usuario9 = new Usuario(9, "usuario9", "senha9", "usuario14@email.com", true, LocalDate.of(2023, 10, 31));
        this.tabela.add(usuario9);
        Usuario usuario10 = new Usuario(10, "usuario10", "senha10", "usuario15@email.com", true, LocalDate.of(2023, 10, 31));
        this.tabela.add(usuario10);
    }
}
