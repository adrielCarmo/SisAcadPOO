package udp.poo.sisacad.dominio;

import java.util.Date;

public class Professor extends BaseFuncionario{
    private String cargo;

    public Professor() {
    }

    public Professor(int id, String nome, Date dataNasc, String rg, String cpf, Usuario usuario, Endereco endereco, String setor, double salario, Date dataAdmissao, Date dataDemissao, String cargo) {
        super(id, nome, dataNasc, rg, cpf, usuario, endereco, setor, salario, dataAdmissao, dataDemissao);
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
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("RG: " + this.getRg());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Usuário: " + this.getUsuario().getUsername());
        System.out.println("Endereço: " + this.getEndereco().getLogradouro() + ", " + this.getEndereco().getNum() + " - " + this.getEndereco().getBairro());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Data Admissão: " + this.getDataAdmissao());
        System.out.println("Cargo: " + this.getCargo());
    }
}
