package udp.poo.sisacad.dominio;

import java.util.Date;

public class Aluno extends BasePessoa{
    private int periodo;
    private int registroAcademico;
    private boolean aprovado;
    private RendimentoEscolar rendEscolar;
    private Turma turma;

    public Aluno() {
    }

    public Aluno(int id, String nome, Date dataNasc, String rg, String cpf, Usuario usuario, Endereco endereco, int periodo, int registroAcademico, boolean aprovado, RendimentoEscolar rendEscolar, Turma turma) {
        super(id, nome, dataNasc, rg, cpf, usuario, endereco);
        this.periodo = periodo;
        this.registroAcademico = registroAcademico;
        this.aprovado = aprovado;
        this.rendEscolar = rendEscolar;
        this.turma = turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public RendimentoEscolar getRendEscolar() {
        return rendEscolar;
    }

    public void setRendEscolar(RendimentoEscolar rendEscolar) {
        this.rendEscolar = rendEscolar;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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
        System.out.println("Período: " + this.getPeriodo());
        System.out.println("RA: " + this.getRegistroAcademico());
        System.out.println("ID Turma:" + this.turma.getId());
        System.out.println("Aprovado: " + this.isAprovado());
    }
}
