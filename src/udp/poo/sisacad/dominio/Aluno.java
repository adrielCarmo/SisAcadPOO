package udp.poo.sisacad.dominio;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends BasePessoa {
    
    private int periodo;
    private long registroAcademico;
    private String situacao;
    private RendimentoEscolar rendimento;
    private Turma turma;
    private ArrayList<NotaTrabalho> notas;
    
    public Aluno() {
    }

    public Aluno(long id, String nome, String telefone, Date dataNasc, String rg, String cpf, Usuario user,
            Endereco endereco, int periodo, long registroAcademico, String situacao, RendimentoEscolar rendimento,
            Turma turma, ArrayList<NotaTrabalho> notas) {
        super(id, nome, telefone, dataNasc, rg, cpf, user, endereco);
        this.periodo = periodo;
        this.registroAcademico = registroAcademico;
        this.situacao = situacao;
        this.rendimento = rendimento;
        this.turma = turma;
        this.notas = notas;
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

    public RendimentoEscolar getRendimento() {
        return rendimento;
    }

    public void setRendimento(RendimentoEscolar rendimento) {
        this.rendimento = rendimento;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
    
    public ArrayList<NotaTrabalho> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<NotaTrabalho> notas) {
        this.notas = notas;
    }


    @Override
    public void imprimir() {
        System.out.println("ID: " + this.getId());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.endereco);
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
