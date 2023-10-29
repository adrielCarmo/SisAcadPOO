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

}
