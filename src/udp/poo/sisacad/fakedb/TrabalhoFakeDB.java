package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Trabalho;

import java.text.ParseException;

public class TrabalhoFakeDB extends BaseFakeDB<Trabalho>{

    private final DisciplinaFakeDB discFakeDB;
    public TrabalhoFakeDB() throws ParseException {
        super();
        discFakeDB = new DisciplinaFakeDB();
    }

    @Override
    protected void carregarDados() throws ParseException {
        Trabalho trabalho1 = new Trabalho(1, "Trabalho de Matemática", dateFormat.parse("10/10/2023"), discFakeDB.getTabela().get(1));
        this.tabela.add(trabalho1);
        Trabalho trabalho2 = new Trabalho(2, "Pesquisa de História", dateFormat.parse("01/10/2023"), discFakeDB.getTabela().get(2));
        this.tabela.add(trabalho2);
        Trabalho trabalho3 = new Trabalho(3, "Programação em Java", dateFormat.parse("23/10/2023"), discFakeDB.getTabela().get(3));
        this.tabela.add(trabalho3);
        Trabalho trabalho4 = new Trabalho(4, "Experiência de Física", dateFormat.parse("10/09/2023"), discFakeDB.getTabela().get(4));
        this.tabela.add(trabalho4);
        Trabalho trabalho5 = new Trabalho(5, "Redação em Inglês", dateFormat.parse("08/02/2023"), discFakeDB.getTabela().get(5));
        this.tabela.add(trabalho5);
    }
}
