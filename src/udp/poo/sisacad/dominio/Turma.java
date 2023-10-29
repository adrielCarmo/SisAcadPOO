package udp.poo.sisacad.dominio;

public class Turma extends BaseIdentificador {
    
    private int capacidadeMaxAlunos;

    public Turma() {
    }

    public Turma(long id, int capacidadeMaxAlunos) {
        super(id);
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
    }

    public int getCapacidadeMaxAlunos() {
        return capacidadeMaxAlunos;
    }

    public void setCapacidadeMaxAlunos(int capacidadeMaxAlunos) {
        this.capacidadeMaxAlunos = capacidadeMaxAlunos;
    }

}
