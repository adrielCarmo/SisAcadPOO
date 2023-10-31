package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Usuario;
import udp.poo.sisacad.repositorio.PerfilUsuarioRepo;

import java.text.ParseException;

public class UsuarioFakeDB extends BaseFakeDB<Usuario> {
    PerfilUsuarioRepo perfilUsuarioRepository;
    public UsuarioFakeDB() throws ParseException {
        perfilUsuarioRepository = new PerfilUsuarioRepo();
    }

    @Override
    protected void carregarDados() throws ParseException {
        this.tabela.add(new Usuario(1L,"a.carmo","teste123","teste@gmail.com",false,this.dateFormat.parse("31/10/2023"), perfilUsuarioRepository.read(2L)));
        this.tabela.add(new Usuario(2L,"a.carmo","teste123","teste@gmail.com",false,this.dateFormat.parse("31/10/2023"), perfilUsuarioRepository.read(2L)));
        this.tabela.add(new Usuario(3L,"a.carmo","teste123","teste@gmail.com",false,this.dateFormat.parse("31/10/2023"), perfilUsuarioRepository.read(2L)));
        this.tabela.add(new Usuario(4L,"a.carmo","teste123","teste@gmail.com",false,this.dateFormat.parse("31/10/2023"), perfilUsuarioRepository.read(2L)));
        this.tabela.add(new Usuario(5L,"a.carmo","teste123","teste@gmail.com",false,this.dateFormat.parse("31/10/2023"), perfilUsuarioRepository.read(2L)));
    }
}
