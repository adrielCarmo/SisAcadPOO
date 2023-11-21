package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.NotaTrabalho;

public class NotaTrabalhoFakeDB extends BaseFakeDB<NotaTrabalho>{
    private final AlunoFakeDB alunoFakeDB;
    private final TrabalhoFakeDB trabFakeDB;

    public NotaTrabalhoFakeDB(){
        super();
        alunoFakeDB = new AlunoFakeDB();
        trabFakeDB = new TrabalhoFakeDB();
    }

    @Override
    protected void carregarDados() {
        NotaTrabalho nota1 = new NotaTrabalho(1, 8.5, alunoFakeDB.getTabela().get(1), trabFakeDB.getTabela().get(1));
        this.tabela.add(nota1);
        NotaTrabalho nota2 = new NotaTrabalho(2, 7.0, alunoFakeDB.getTabela().get(1), trabFakeDB.getTabela().get(2));
        this.tabela.add(nota2);
        NotaTrabalho nota3 = new NotaTrabalho(3, 9.5, alunoFakeDB.getTabela().get(1), trabFakeDB.getTabela().get(3));
        this.tabela.add(nota3);
        NotaTrabalho nota4 = new NotaTrabalho(4, 6.0, alunoFakeDB.getTabela().get(1), trabFakeDB.getTabela().get(4));
        this.tabela.add(nota4);
        NotaTrabalho nota5 = new NotaTrabalho(5, 9.0, alunoFakeDB.getTabela().get(2), trabFakeDB.getTabela().get(1));
        this.tabela.add(nota5);
        NotaTrabalho nota6 = new NotaTrabalho(6, 8.0, alunoFakeDB.getTabela().get(2), trabFakeDB.getTabela().get(2));
        this.tabela.add(nota6);
        NotaTrabalho nota7 = new NotaTrabalho(7, 7.5, alunoFakeDB.getTabela().get(2), trabFakeDB.getTabela().get(3));
        this.tabela.add(nota7);
        NotaTrabalho nota8 = new NotaTrabalho(8, 9.0, alunoFakeDB.getTabela().get(2), trabFakeDB.getTabela().get(4));
        this.tabela.add(nota8);
        NotaTrabalho nota9 = new NotaTrabalho(9, 6.5, alunoFakeDB.getTabela().get(3), trabFakeDB.getTabela().get(1));
        this.tabela.add(nota9);
        NotaTrabalho nota10 = new NotaTrabalho(10, 8.5, alunoFakeDB.getTabela().get(3), trabFakeDB.getTabela().get(2));
        this.tabela.add(nota10);
        NotaTrabalho nota11 = new NotaTrabalho(11, 9.0, alunoFakeDB.getTabela().get(3), trabFakeDB.getTabela().get(3));
        this.tabela.add(nota11);
        NotaTrabalho nota12 = new NotaTrabalho(12, 7.5, alunoFakeDB.getTabela().get(3), trabFakeDB.getTabela().get(4));
        this.tabela.add(nota12);
        NotaTrabalho nota13 = new NotaTrabalho(13, 8.0, alunoFakeDB.getTabela().get(4), trabFakeDB.getTabela().get(1));
        this.tabela.add(nota13);
        NotaTrabalho nota14 = new NotaTrabalho(14, 7.0, alunoFakeDB.getTabela().get(4), trabFakeDB.getTabela().get(2));
        this.tabela.add(nota14);
        NotaTrabalho nota15 = new NotaTrabalho(15, 8.5, alunoFakeDB.getTabela().get(4), trabFakeDB.getTabela().get(3));
        this.tabela.add(nota15);
        NotaTrabalho nota16 = new NotaTrabalho(16, 6.5, alunoFakeDB.getTabela().get(4), trabFakeDB.getTabela().get(4));
        this.tabela.add(nota16);
        NotaTrabalho nota17 = new NotaTrabalho(17, 8.0, alunoFakeDB.getTabela().get(5), trabFakeDB.getTabela().get(1));
        this.tabela.add(nota17);
        NotaTrabalho nota18 = new NotaTrabalho(18, 9.5, alunoFakeDB.getTabela().get(5), trabFakeDB.getTabela().get(2));
        this.tabela.add(nota18);
        NotaTrabalho nota19 = new NotaTrabalho(19, 7.5, alunoFakeDB.getTabela().get(5), trabFakeDB.getTabela().get(3));
        this.tabela.add(nota19);
        NotaTrabalho nota20 = new NotaTrabalho(20, 9.0, alunoFakeDB.getTabela().get(5), trabFakeDB.getTabela().get(4));
        this.tabela.add(nota20);
    }
}
