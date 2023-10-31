package udp.poo.sisacad.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Usuario extends BaseIdentificador {

    private String username;
    private String senha;
    private String email;
    private boolean ativo;
    private Date dataInsercao;
    private PerfilUsuario perfilUsuario;
    
    public Usuario() {
    }

    public Usuario(long id, String username, String senha, String email, boolean ativo, Date dataInsercao, PerfilUsuario perfilUsuario) {
        super(id);
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.dataInsercao = dataInsercao;
        this.perfilUsuario = perfilUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public PerfilUsuario getPerfilUsuario() {
        return perfilUsuario;
    }

    public void setPerfilUsuario(PerfilUsuario perfilUsuario) {
        this.perfilUsuario = perfilUsuario;
    }
}