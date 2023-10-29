package udp.poo.sisacad.dominio;

import java.util.Date;

public abstract class BaseFuncionario extends BasePessoa {
    
    protected long matricula;
    protected String setor;
    protected double salario;
    protected Date dataVinculoInicial;
    protected Date dataVinculoFinal;
    
    public BaseFuncionario() {
    }

    public BaseFuncionario(long id, String nome, String telefone, Date dataNasc, String rg, String cpf, long matricula,
            String setor, double salario, Date dataVinculoInicial, Date dataVinculoFinal) {
        super(id, nome, telefone, dataNasc, rg, cpf);
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
        this.dataVinculoInicial = dataVinculoInicial;
        this.dataVinculoFinal = dataVinculoFinal;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
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

    public Date getDataVinculoInicial() {
        return dataVinculoInicial;
    }

    public void setDataVinculoInicial(Date dataVinculoInicial) {
        this.dataVinculoInicial = dataVinculoInicial;
    }

    public Date getDataVinculoFinal() {
        return dataVinculoFinal;
    }

    public void setDataVinculoFinal(Date dataVinculoFinal) {
        this.dataVinculoFinal = dataVinculoFinal;
    }
    
}
