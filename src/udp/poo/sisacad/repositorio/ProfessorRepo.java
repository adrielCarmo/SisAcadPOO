package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Professor;
import udp.poo.sisacad.fakedb.ProfessorFakeDB;

public class ProfessorRepo extends BaseRepositorio<ProfessorFakeDB, Professor>{

    public ProfessorRepo(){
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Professor create(Professor prof) {
        int tamanho = this.dataset.size() - 1; // pega o tamanho da lista
        int proxID = this.dataset.get(tamanho).getId(); // busca o ID da ultima posicao da lista e armazena
        proxID++;
        prof.setId(proxID);
        this.dataset.add(prof); // add o prof na lista do dataset após setar o seu no ID
        return prof;
    }

    @Override
    public Professor read(int id) {
        for (Professor prof : this.dataset) {
            if(prof.getId() == id) {
                return prof;
            }
        }
        return null;
    }

    @Override
    public Professor update(Professor prof) {
        Professor alvo = this.read(prof.getId());
        alvo.setNome(prof.getNome());
        alvo.setDataNasc(prof.getDataNasc());
        alvo.setCpf(prof.getCpf());
        alvo.setRg(prof.getRg());
        alvo.setDataAdmissao(prof.getDataAdmissao());
        alvo.setDataDemissao(prof.getDataDemissao());
        alvo.setUsuario(prof.getUsuario());
        alvo.setCargo(prof.getCargo());
        alvo.setEndereco(prof.getEndereco());
        alvo.setSetor(prof.getSetor());
        alvo.setSalario(prof.getSalario());
        return alvo;
    }

    @Override
    public Professor delete(int id) {
        Professor alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
