package udp.poo.sisacad.dominio;

import java.util.Date;

public class Professor extends BaseFuncionario{
    
    private String cargo;

    public Professor() {
    }

    public Professor(long id, String nome, String telefone, Date dataNasc, String rg, String cpf, long matricula,
            String setor, double salario, Date dataVinculoInicial, Date dataVinculoFinal, String cargo) {
        super(id, nome, telefone, dataNasc, rg, cpf, matricula, setor, salario, dataVinculoInicial, dataVinculoFinal);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
