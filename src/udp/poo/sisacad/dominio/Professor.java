package udp.poo.sisacad.dominio;

import java.util.Date;

public class Professor extends BaseFuncionario{
    private String cargo;

    public Professor() {
    }

    public Professor(int id, String nome, Date dataNasc, String rg, String cpf, Usuario usuario, String setor, double salario, Date dataAdmissao, Date dataDemissao, String cargo) {
        super(id, nome, dataNasc, rg, cpf, usuario, setor, salario, dataAdmissao, dataDemissao);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimir() {

    }
}
