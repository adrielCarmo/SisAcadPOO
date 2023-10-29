package udp.poo.sisacad.servico;

import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.repositorio.AlunoRepo;

import java.text.ParseException;
import java.util.ArrayList;

public class AlunoServico extends BaseServico<AlunoRepo, Aluno> {

    public AlunoServico() throws ParseException {
        this.repo = new AlunoRepo();
    }

    @Override
    public Aluno inserir(Aluno tupla) {
        return this.repo.create(tupla);
    }

    @Override
    public Aluno obter(Long id) {
        return this.repo.read(id);
    }

    @Override
    public ArrayList<Aluno> listar() {
        return this.repo.readAll();
    }

    @Override
    public Aluno atualizar(Aluno tupla) {
        return null;
    }

    @Override
    public Aluno deletar(Long id) {
        return null;
    }
}
