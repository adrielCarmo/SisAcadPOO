package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Professor;

import java.text.ParseException;

public class ProfessorFakeDB extends BaseFakeDB<Professor>{
    private final UsuarioFakeDB usuarioFakeDB; //final pois nao pode ser alterado, é somente para consultar os relacionamentos
    private final EnderecoFakeDB endFakeDB;
    public ProfessorFakeDB() throws ParseException {
        super();
        usuarioFakeDB = new UsuarioFakeDB();
        endFakeDB = new EnderecoFakeDB();
    }

    @Override
    protected void carregarDados() throws ParseException {
        Professor professor1 = new Professor(1, "Professor 1", dateFormat.parse("10/01/1950"), "RG123", "CPF123", usuarioFakeDB.getTabela().get(6), endFakeDB.getTabela().get(6), "Departamento 1", 5000.0, dateFormat.parse("10/01/2000"), null, "Professor");
        Professor professor2 = new Professor(2, "Professor 2", dateFormat.parse("11/01/1995"), "RG456", "CPF456", usuarioFakeDB.getTabela().get(7), endFakeDB.getTabela().get(7), "Departamento 2", 5500.0, dateFormat.parse("02/08/2010"), null, "Professor");
        Professor professor3 = new Professor(3, "Professor 3", dateFormat.parse("15/07/1998"), "RG789", "CPF789", usuarioFakeDB.getTabela().get(8), endFakeDB.getTabela().get(8), "Departamento 1", 5200.0, dateFormat.parse("15/10/2020"), null, "Professor");
        Professor professor4 = new Professor(4, "Professor 4", dateFormat.parse("14/04/1995"), "RG101", "CPF101", usuarioFakeDB.getTabela().get(9), endFakeDB.getTabela().get(9), "Departamento 3", 6000.0, dateFormat.parse("30/10/2022"), null, "Professor");
        Professor professor5 = new Professor(5, "Professor 5", dateFormat.parse("13/01/1960"), "RG202", "CPF202", usuarioFakeDB.getTabela().get(10), endFakeDB.getTabela().get(10), "Departamento 2", 5800.0, dateFormat.parse("31/12/2021"), null, "Professor");
    }
}
