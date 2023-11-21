package udp.poo.sisacad.dominio;

public class NotaTrabalho extends BaseIdentificador{
    private double nota;
    private Aluno aluno;
    private Trabalho trabalho;

    public NotaTrabalho() {
    }

    public NotaTrabalho(int id, double nota, Aluno aluno, Trabalho trabalho) {
        super(id);
        this.nota = nota;
        this.aluno = aluno;
        this.trabalho = trabalho;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
}
