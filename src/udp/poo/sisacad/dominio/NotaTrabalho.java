package udp.poo.sisacad.dominio;

public class NotaTrabalho {
    
    private double nota;
    private Trabalho trabalho;

    public NotaTrabalho() {
    }

    public NotaTrabalho(double nota, Trabalho trabalho) {
        this.nota = nota;
        this.trabalho = trabalho;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

}