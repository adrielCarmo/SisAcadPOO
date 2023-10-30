package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Aluno;

import java.text.ParseException;

public class AlunoFakeDB extends BaseFakeDB<Aluno> {

    public AlunoFakeDB() throws ParseException {
        super();
    }

    @Override
    protected void carregarDados() throws ParseException {
        this.tabela.add(new Aluno(1L, "Adriel do Vale Lindo", "67884467543", dateFormat.parse("25/11/2000"), "4425332", "08564782433", 4,228270L, "Cursando"));
        this.tabela.add(new Aluno(2L, "Cleitinho Silva Santoro", "67998745632", dateFormat.parse("22/01/2003"), "4567452", "98757436511", 4,142450L, "Cursando"));
        this.tabela.add(new Aluno(3L, "Joaquim Ferreira dos Santos", "67988765322", dateFormat.parse("14/05/1995"), "3378743", "75385910122", 3,523310L, "Cursando"));
        this.tabela.add(new Aluno(4L, "Rafaela Arruda Joarez", "67988765322", dateFormat.parse("14/05/1995"), "3378743", "75385910122", 3,342330L, "Aprovado"));
        this.tabela.add(new Aluno(5L, "João Silva Martin", "67988765322", dateFormat.parse("14/05/1995"), "3378743", "75385910122", 3,117658L, "Reprovado"));
    }
}
