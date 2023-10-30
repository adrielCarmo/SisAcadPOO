package udp.poo.sisacad.dominio;

public class Trabalho extends BaseIdentificador {
    
    private String descricao;

    public Trabalho() {
    }

    public Trabalho(long id, String descricao) {
        super(id);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}