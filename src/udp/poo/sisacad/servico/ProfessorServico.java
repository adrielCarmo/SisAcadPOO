package udp.poo.sisacad.servico;

import udp.poo.sisacad.dominio.Professor;
import udp.poo.sisacad.repositorio.ProfessorRepo;

import java.text.ParseException;
import java.util.ArrayList;

public class ProfessorServico extends BaseServico<ProfessorRepo, Professor>{

    public ProfessorServico() throws ParseException {
        this.repo = new ProfessorRepo();
    }

    @Override
    public Professor inserir(Professor tupla) {
        return this.repo.create(tupla);
    }

    @Override
    public Professor obter(int id) {
        return this.repo.read(id);
    }

    @Override
    public ArrayList<Professor> listarTudo() {
        return this.repo.readAll();
    }

    @Override
    public Professor atualizar(Professor tupla) {
        return this.repo.update(tupla);
    }

    @Override
    public Professor excluir(int id) {
        return this.repo.delete(id);
    }
}
