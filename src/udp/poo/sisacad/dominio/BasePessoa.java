package udp.poo.sisacad.dominio;

import java.util.Date;

public abstract class BasePessoa extends BaseIdentificador implements IImpressao {
    protected String nome;
    protected Date dataNasc;
    protected String rg;
    protected String cpf;
    protected Usuario usuario;
    protected Endereco endereco;

    public BasePessoa() {
    }

    public BasePessoa(int id, String nome, Date dataNasc, String rg, String cpf, Usuario usuario, Endereco endereco) {
        super(id);
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.usuario = usuario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
