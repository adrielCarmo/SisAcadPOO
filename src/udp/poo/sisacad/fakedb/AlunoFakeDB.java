package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.*;

import java.text.ParseException;

public class AlunoFakeDB extends BaseFakeDB<Aluno>{
    private final UsuarioFakeDB usuarioFakeDB; //final pois nao pode ser alterado, é somente para consultar os relacionamentos
    private final EnderecoFakeDB endFakeDB;
    public AlunoFakeDB() throws ParseException {
        super();
        usuarioFakeDB = new UsuarioFakeDB();
        endFakeDB = new EnderecoFakeDB();
    }

    @Override
    protected void carregarDados() throws ParseException {
        Aluno aluno1 = new Aluno(1, "João da Silva", dateFormat.parse("15/09/2021"), "1234567", "987654321", usuarioFakeDB.getTabela().get(0), endFakeDB.getTabela().get(0), 3, 2023001, true, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno1);
        Aluno aluno2 = new Aluno(2, "Maria Santos", dateFormat.parse("20/08/2021"), "7654321", "123456789", usuarioFakeDB.getTabela().get(1), endFakeDB.getTabela().get(1), 2, 2023002, false, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno2);
        Aluno aluno3 = new Aluno(3, "Pedro Alves", dateFormat.parse("11/07/2001"), "9876543", "456789123", usuarioFakeDB.getTabela().get(2), endFakeDB.getTabela().get(2), 4, 2023003, true, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno3);
        Aluno aluno4 = new Aluno(4, "Ana Pereira", dateFormat.parse("15/11/2021"), "5432167", "321987654", usuarioFakeDB.getTabela().get(3), endFakeDB.getTabela().get(3), 2, 2023004, false, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno4);
        Aluno aluno5 = new Aluno(5, "Carlos Lima", dateFormat.parse("17/01/2015"), "2345678", "654321987", usuarioFakeDB.getTabela().get(4), endFakeDB.getTabela().get(4), 5, 2023005, true, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno5);
    }
}