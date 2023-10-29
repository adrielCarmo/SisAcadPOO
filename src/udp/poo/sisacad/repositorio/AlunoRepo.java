package udp.poo.sisacad.repositorio;

import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.fakedb.AlunoFakeDB;

import java.text.ParseException;

public class AlunoRepo extends BaseRepoCRUD<AlunoFakeDB, Aluno>{

    public AlunoRepo() throws ParseException {
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Aluno create(Aluno aluno) {
        int tamanho = this.dataset.size() - 1; // pega o tamanho da lista
        Long proxID = this.dataset.get(tamanho).getId(); // busca o ID da ultima posicao da lista e armazena
        proxID++;
        aluno.setId(proxID);
        this.dataset.add(aluno); // add o aluno na lista do dataset após setar o seu no ID
        return aluno;
    }

    @Override
    public Aluno read(Long id) {
        for (Aluno aluno : this.dataset) {
            if(aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public Aluno update(Aluno aluno) {
        Aluno alvo = this.read(aluno.getId());
        alvo.setNome(aluno.getNome());
        alvo.setTelefone(aluno.getTelefone());
        alvo.setDataNasc(aluno.getDataNasc());
        alvo.setCpf(aluno.getCpf());
        alvo.setRg(aluno.getRg());
        alvo.setRegistroAcademico(aluno.getRegistroAcademico());
        alvo.setPeriodo(aluno.getPeriodo());
        alvo.setSituacao(aluno.getSituacao());
        return alvo;
    }

    @Override
    public Aluno delete(Long id) {
        Aluno alvo = this.read(id);
        this.dataset.remove(alvo);
        return alvo;
    }
}
