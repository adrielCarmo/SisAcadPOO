package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Trabalho;
import java.time.LocalDate;

public class TrabalhoFakeDB extends BaseFakeDB<Trabalho>{

    public TrabalhoFakeDB(){
        super();
    }

    @Override
    protected void carregarDados(){
        Trabalho trabalho1 = new Trabalho(1, "Trabalho de Matemática", LocalDate.of(2023, 10, 10));
        this.tabela.add(trabalho1);
        Trabalho trabalho2 = new Trabalho(2, "Pesquisa de História", LocalDate.of(2023, 10, 1));
        this.tabela.add(trabalho2);
        Trabalho trabalho3 = new Trabalho(3, "Programação em Java", LocalDate.of(2023, 10, 23));
        this.tabela.add(trabalho3);
        Trabalho trabalho4 = new Trabalho(4, "Experiência de Física", LocalDate.of(2023, 9, 10));
        this.tabela.add(trabalho4);
        Trabalho trabalho5 = new Trabalho(5, "Redação em Inglês", LocalDate.of(2023, 2, 8));
        this.tabela.add(trabalho5);
    }
}
