package udp.poo.sisacad.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Usuario extends BaseIdentificador {

    private String usuario;
    private String senha;
    private String email;
    private boolean ativo;
    private Date dataInsercao;
    private ArrayList <PerfilUsuario> perfis;
    
    public Usuario() {
    }

    public Usuario(long id, String usuario, String senha, String email, boolean ativo, Date dataInsercao,
            ArrayList<PerfilUsuario> perfis) {
        super(id);
        this.usuario = usuario;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.dataInsercao = dataInsercao;
        this.perfis = perfis;
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

    public ArrayList<PerfilUsuario> getPerfis() {
        return perfis;
    }

    public void setPerfis(ArrayList<PerfilUsuario> perfis) {
        this.perfis = perfis;
    }
    
}