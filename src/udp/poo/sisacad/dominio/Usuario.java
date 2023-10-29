package udp.poo.sisacad.dominio;

import java.util.Date;

public class Usuario extends BaseIdentificador {

    private String usuario;
    private String senha;
    private String email;
    private boolean ativo;
    private Date dataInsercao;
    
    public Usuario() {
    }

    public Usuario(long id, String usuario, String senha, String email, boolean ativo, Date dataInsercao) {
        super(id);
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.dataInsercao = dataInsercao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(Date dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
    
}
