package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.*;

import java.time.LocalDate;

public class AlunoFakeDB extends BaseFakeDB<Aluno>{
    public AlunoFakeDB(){
        super();
    }

    @Override
    protected void carregarDados() {
        Aluno aluno1 = new Aluno(1, "João da Silva", LocalDate.of(2021,9,15), "1234567", "987654321", 3, 2023001, true);
        this.tabela.add(aluno1);
        Aluno aluno2 = new Aluno(2, "Maria Santos", LocalDate.of(2021,8,20), "7654321", "123456789", 2, 2023002, false);
        this.tabela.add(aluno2);
        Aluno aluno3 = new Aluno(3, "Pedro Alves", LocalDate.of(2001,7,11), "9876543", "456789123", 4, 2023003, true);
        this.tabela.add(aluno3);
        Aluno aluno4 = new Aluno(4, "Ana Pereira", LocalDate.of(2021,11,15), "5432167", "321987654", 2, 2023004, false);
        this.tabela.add(aluno4);
        Aluno aluno5 = new Aluno(5, "Carlos Lima", LocalDate.of(2015,1,17), "2345678", "654321987", 5, 2023005, true);
        this.tabela.add(aluno5);
    }
}