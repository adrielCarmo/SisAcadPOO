package udp.poo.sisacad.dominio;

import java.util.Date;

public class Aluno extends BasePessoa {
    
    private int periodo;
    private long registroAcademico;
    private String situacao;
    
    public Aluno() {
    }

    public Aluno(long id, String nome, String telefone, Date dataNasc, String rg, String cpf, int periodo,
                 long registroAcademico, String situacao) {
        super(id, nome, telefone, dataNasc, rg, cpf);
        this.periodo = periodo;
        this.registroAcademico = registroAcademico;
        this.situacao = situacao;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public long getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(long registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public void imprimir() {
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        //System.out.println("Endereço: " + this.endereco);
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("RG: " + this.getRg());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("RA: " + this.getRegistroAcademico());
        System.out.println("Situação: " + this.getSituacao());
        System.out.println("Período: " + this.getPeriodo());
    }
}
