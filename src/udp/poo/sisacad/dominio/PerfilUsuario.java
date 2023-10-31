package udp.poo.sisacad.dominio;

public class PerfilUsuario extends BaseIdentificador {
    private String autorizacao;

    public PerfilUsuario() {
    }

    public PerfilUsuario(long id, String autorizacao) {
        super(id);
        this.autorizacao = autorizacao;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }
}