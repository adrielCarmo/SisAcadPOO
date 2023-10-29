package udp.poo.sisacad.dominio;

import java.util.Date;

public class BasePessoa extends BaseIdentificador {
    
    protected String nome;
    protected String telefone;
    protected Date dataNasc;
    protected String rg;
    protected String cpf;
    
    public BasePessoa() {
    }

    public BasePessoa(long id, String nome, String telefone, Date dataNasc, String rg, String cpf) {
        super(id);
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
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
    
}
