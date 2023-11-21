package udp.poo.sisacad.dominio;

import java.time.LocalDate;

public class Usuario extends BaseIdentificador {
    private String username;
    private String senha;
    private String email;
    private boolean ativo;
    private LocalDate dataInsercao;

    public Usuario() {
    }

    public Usuario(int id, String username, String senha, String email, boolean ativo, LocalDate dataInsercao) {
        super(id);
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.ativo = ativo;
        this.dataInsercao = dataInsercao;
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

    public LocalDate getDataInsercao() {
        return dataInsercao;
    }

    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
}
