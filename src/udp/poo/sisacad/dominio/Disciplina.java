package udp.poo.sisacad.dominio;

public class Disciplina extends BaseIdentificador {
    
    private String nome;
    private String ementa;
    
    public Disciplina() {
    }

    public Disciplina(long id, String nome, String ementa) {
        super(id);
        this.nome = nome;
        this.ementa = ementa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

}
