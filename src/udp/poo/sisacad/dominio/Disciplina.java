package udp.poo.sisacad.dominio;

import java.util.ArrayList;

public class Disciplina extends BaseIdentificador {
    
    private String nome;
    private String ementa;
    private ArrayList<Trabalho> trabalhos;
    
    public Disciplina() {
    }

    public Disciplina(long id, String nome, String ementa, ArrayList<Trabalho> trabalhos) {
        super(id);
        this.nome = nome;
        this.ementa = ementa;
        this.trabalhos = trabalhos;
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

    public ArrayList<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(ArrayList<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }

}