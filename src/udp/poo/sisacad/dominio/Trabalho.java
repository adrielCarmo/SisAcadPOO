package udp.poo.sisacad.dominio;

import java.util.Date;

public class Trabalho extends BaseIdentificador{
    private String descricao;
    private Date dataEntrega;
    private Disciplina disciplina;

    public Trabalho() {
    }

    public Trabalho(int id, String descricao, Date dataEntrega, Disciplina disciplina) {
        super(id);
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
        this.disciplina = disciplina;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
