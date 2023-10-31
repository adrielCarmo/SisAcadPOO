package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Aluno;
import udp.poo.sisacad.dominio.RendimentoEscolar;
import udp.poo.sisacad.dominio.Turma;
import udp.poo.sisacad.dominio.Usuario;

import java.text.ParseException;

public class AlunoFakeDB extends BaseFakeDB<Aluno>{
    public AlunoFakeDB() throws ParseException {
        super();
    }

    @Override
    protected void carregarDados() throws ParseException {
        Aluno aluno1 = new Aluno(1, "João da Silva", dateFormat.parse("15/09/2021"), "1234567", "987654321", new Usuario(), 3, 2023001, true, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno1);
        Aluno aluno2 = new Aluno(2, "Maria Santos", dateFormat.parse("20/08/2021"), "7654321", "123456789", new Usuario(), 2, 2023002, false, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno2);
        Aluno aluno3 = new Aluno(3, "Pedro Alves", dateFormat.parse("11/07/2001"), "9876543", "456789123", new Usuario(), 4, 2023003, true, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno3);
        Aluno aluno4 = new Aluno(4, "Ana Pereira", dateFormat.parse("15/11/2021"), "5432167", "321987654", new Usuario(), 2, 2023004, false, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno4);
        Aluno aluno5 = new Aluno(5, "Carlos Lima", dateFormat.parse("17/01/2015"), "2345678", "654321987", new Usuario(), 5, 2023005, true, new RendimentoEscolar(), new Turma());
        this.tabela.add(aluno5);
    }
}
