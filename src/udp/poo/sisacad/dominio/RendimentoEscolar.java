package udp.poo.sisacad.dominio;

import java.util.ArrayList;

public class RendimentoEscolar extends BaseIdentificador{
    private double notaP1;
    private double notaP2;
    private double mediaTrabalhos;
    private double mediaGeral;
    private Aluno aluno;
    private ArrayList<NotaTrabalho> notasTrabalhos;

    public RendimentoEscolar() {
    }

    public RendimentoEscolar(int id, double notaP1, double notaP2, double mediaTrabalhos, double mediaGeral, Aluno aluno, ArrayList<NotaTrabalho> notasTrabalhos) {
        super(id);
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
        this.aluno = aluno;
        this.notasTrabalhos = notasTrabalhos;
    }

    public double getNotaP1() {
        return notaP1;
    }

    public void setNotaP1(double notaP1) {
        this.notaP1 = notaP1;
    }

    public double getNotaP2() {
        return notaP2;
    }

    public void setNotaP2(double notaP2) {
        this.notaP2 = notaP2;
    }

    public double getMediaTrabalhos() {
        return mediaTrabalhos;
    }

    public void setMediaTrabalhos(double mediaTrabalhos) {
        this.mediaTrabalhos = mediaTrabalhos;
    }

    public double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(double mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public ArrayList<NotaTrabalho> getNotasTrabalhos() {
        return notasTrabalhos;
    }

    public void setNotasTrabalhos(ArrayList<NotaTrabalho> notasTrabalhos) {
        this.notasTrabalhos = notasTrabalhos;
    }
}
