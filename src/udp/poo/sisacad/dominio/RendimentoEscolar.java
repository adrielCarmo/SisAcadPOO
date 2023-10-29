package udp.poo.sisacad.dominio;

public class RendimentoEscolar extends BaseIdentificador{
    
    private double notaP1;
    private double notaP2;
    private double mediaTrabalhos;
    private double mediaGeral;
    
    public RendimentoEscolar() {
    }

    public RendimentoEscolar(long id, double notaP1, double notaP2, double mediaTrabalhos, double mediaGeral) {
        super(id);
        this.notaP1 = notaP1;
        this.notaP2 = notaP2;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaGeral = mediaGeral;
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

}
