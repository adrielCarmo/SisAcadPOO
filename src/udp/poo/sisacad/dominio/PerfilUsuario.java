package udp.poo.sisacad.dominio;

public class PerfilUsuario {
    
    private String autorizacao;

    public PerfilUsuario() {
    }

    public PerfilUsuario(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

}