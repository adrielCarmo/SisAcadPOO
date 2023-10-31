package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.NotaTrabalho;
import udp.poo.sisacad.dominio.RendimentoEscolar;

import java.text.ParseException;
import java.util.ArrayList;

public class RendimentoEscolarFakeDB extends BaseFakeDB<RendimentoEscolar>{
    private final AlunoFakeDB alunoFakeDB;
    private final NotaTrabalhoFakeDB nTrabFakeDB;
    public RendimentoEscolarFakeDB() throws ParseException {
        super();
        alunoFakeDB = new AlunoFakeDB();
        nTrabFakeDB = new NotaTrabalhoFakeDB();
    }

    public ArrayList<NotaTrabalho> queryNotaTrab(int id){
        ArrayList<NotaTrabalho> notasTrabalhosAluno = new ArrayList<>();

        for (NotaTrabalho notaTrabalho : nTrabFakeDB.getTabela()) {
            if(notaTrabalho.getAluno().getId() == id) {
                notasTrabalhosAluno.add(notaTrabalho);
            }
        }
        return notasTrabalhosAluno;
    }

    @Override
    protected void carregarDados() throws ParseException {
        RendimentoEscolar rendimento1 = new RendimentoEscolar(1, 8.5, 7.0, 9.0, 8.0, alunoFakeDB.getTabela().get(1), queryNotaTrab(1));
        this.tabela.add(rendimento1);
        RendimentoEscolar rendimento2 = new RendimentoEscolar(2, 7.0, 8.0, 8.5, 7.5, alunoFakeDB.getTabela().get(2), queryNotaTrab(2));
        this.tabela.add(rendimento2);
        RendimentoEscolar rendimento3 = new RendimentoEscolar(3, 9.5, 8.5, 9.0, 9.0, alunoFakeDB.getTabela().get(3), queryNotaTrab(3));
        this.tabela.add(rendimento3);
        RendimentoEscolar rendimento4 = new RendimentoEscolar(4, 6.0, 6.5, 7.5, 7.0, alunoFakeDB.getTabela().get(4), queryNotaTrab(4));
        this.tabela.add(rendimento4);
        RendimentoEscolar rendimento5 = new RendimentoEscolar(5, 8.0, 9.0, 8.0, 8.5, alunoFakeDB.getTabela().get(5), queryNotaTrab(5));
        this.tabela.add(rendimento5);
    }
}
