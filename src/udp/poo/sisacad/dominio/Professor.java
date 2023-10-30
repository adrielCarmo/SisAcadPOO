package udp.poo.sisacad.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Professor extends BaseFuncionario{
    
    private String cargo;
    private ArrayList<Turma> turmas;

    public Professor() {
    }

    public Professor(long id, String nome, String telefone, Date dataNasc, String rg, String cpf, Usuario user,
            Endereco endereco, long matricula, String setor, double salario, Date dataVinculoInicial,
            Date dataVinculoFinal, String cargo, ArrayList<Turma> turmas) {
        super(id, nome, telefone, dataNasc, rg, cpf, user, endereco, matricula, setor, salario, dataVinculoInicial,
                dataVinculoFinal);
        this.cargo = cargo;
        this.turmas = turmas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
    
    @Override
    public void imprimir() {

    }

}