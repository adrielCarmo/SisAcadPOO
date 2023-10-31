package udp.poo.sisacad.dominio;

import java.util.Date;

public abstract class BaseFuncionario extends BasePessoa {
    protected String setor;
    protected double salario;
    protected Date dataAdmissao;
    protected Date dataDemissao;

    public BaseFuncionario() {
    }

    public BaseFuncionario(int id, String nome, Date dataNasc, String rg, String cpf, Usuario usuario, Endereco endereco, String setor, double salario, Date dataAdmissao, Date dataDemissao) {
        super(id, nome, dataNasc, rg, cpf, usuario, endereco);
        this.setor = setor;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(Date dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
}
