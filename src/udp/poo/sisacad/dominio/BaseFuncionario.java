package udp.poo.sisacad.dominio;

import java.time.LocalDate;

public abstract class BaseFuncionario extends BasePessoa {
    protected String setor;
    protected double salario;
    protected LocalDate dataAdmissao;
    protected LocalDate dataDemissao;

    public BaseFuncionario() {

    }

    public BaseFuncionario(int id, String nome, LocalDate dataNasc, String rg, String cpf, Usuario usuario, Endereco endereco, String setor, double salario, LocalDate dataAdmissao, LocalDate dataDemissao) {
        super(id, nome, dataNasc, rg, cpf);
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

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }
}
