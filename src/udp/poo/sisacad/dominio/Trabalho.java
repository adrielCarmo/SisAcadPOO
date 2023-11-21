package udp.poo.sisacad.dominio;

import java.time.LocalDate;

public class Trabalho extends BaseIdentificador{
    private String descricao;
    private LocalDate dataEntrega;
    private Disciplina disciplina;

    public Trabalho() {
    }

    public Trabalho(int id, String descricao, LocalDate dataEntrega) {
        super(id);
        this.descricao = descricao;
        this.dataEntrega = dataEntrega;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
