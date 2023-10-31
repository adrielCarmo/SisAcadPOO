package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Turma;

import java.text.ParseException;

public class TurmaFakeDB extends BaseFakeDB<Turma>{
    public TurmaFakeDB() throws ParseException {
        super();
    }

    @Override
    protected void carregarDados() throws ParseException {
        this.tabela.add(new Turma());
    }
}
