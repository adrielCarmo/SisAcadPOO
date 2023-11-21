package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Professor;

import java.time.LocalDate;

public class ProfessorFakeDB extends BaseFakeDB<Professor>{
    private final UsuarioFakeDB usuarioFakeDB; //final pois nao pode ser alterado, é somente para consultar os relacionamentos
    private final EnderecoFakeDB endFakeDB;
    public ProfessorFakeDB(){
        super();
        usuarioFakeDB = new UsuarioFakeDB();
        endFakeDB = new EnderecoFakeDB();
    }

    @Override
    protected void carregarDados(){
        Professor professor1 = new Professor(1, "Professor 1", LocalDate.of(1950, 1, 10), "RG123", "CPF123", usuarioFakeDB.getTabela().get(6), endFakeDB.getTabela().get(6), "Departamento 1", 5000.0, LocalDate.of(2000, 1, 10), null, "Professor");
        this.tabela.add(professor1);
        Professor professor2 = new Professor(2, "Professor 2", LocalDate.of(1995, 1, 11), "RG456", "CPF456", usuarioFakeDB.getTabela().get(7), endFakeDB.getTabela().get(7), "Departamento 2", 5500.0, LocalDate.of(2010, 8, 2), null, "Professor");
        this.tabela.add(professor2);
        Professor professor3 = new Professor(3, "Professor 3", LocalDate.of(1998, 7, 15), "RG789", "CPF789", usuarioFakeDB.getTabela().get(8), endFakeDB.getTabela().get(8), "Departamento 1", 5200.0, LocalDate.of(2020, 10, 15), null, "Professor");
        this.tabela.add(professor3);
        Professor professor4 = new Professor(4, "Professor 4", LocalDate.of(1995, 4, 14), "RG101", "CPF101", usuarioFakeDB.getTabela().get(9), endFakeDB.getTabela().get(9), "Departamento 3", 6000.0, LocalDate.of(2022, 10, 30), null, "Professor");
        this.tabela.add(professor4);
        Professor professor5 = new Professor(5, "Professor 5", LocalDate.of(1960, 1, 13), "RG202", "CPF202", usuarioFakeDB.getTabela().get(10), endFakeDB.getTabela().get(10), "Departamento 2", 5800.0, LocalDate.of(2021, 12, 31), null, "Professor");
        this.tabela.add(professor5);
    }
}
