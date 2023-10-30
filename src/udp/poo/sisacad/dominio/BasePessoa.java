package udp.poo.sisacad.dominio;

import java.util.Date;

public abstract class BasePessoa extends BaseIdentificador implements IImpressao {

    protected String nome;
    protected String telefone;
    protected Date dataNasc;
    protected String rg;
    protected String cpf;
    protected Usuario user;
    protected Endereco endereco;
    
    public BasePessoa() {
    }

    public BasePessoa(long id, String nome, String telefone, Date dataNasc, String rg, String cpf, Usuario user,
            Endereco endereco) {
        super(id);
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.user = user;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}