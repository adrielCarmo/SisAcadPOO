package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Disciplina;

public class DisciplinaFakeDB extends BaseFakeDB<Disciplina>{

    public DisciplinaFakeDB(){
        super();
    }

    @Override
    protected void carregarDados(){
        Disciplina disciplina1 = new Disciplina(1, "Matemática", "Tópicos avançados em álgebra e geometria.");
        this.tabela.add(disciplina1);
        Disciplina disciplina2 = new Disciplina(2, "História", "História mundial do século XX.");
        this.tabela.add(disciplina2);
        Disciplina disciplina3 = new Disciplina(3, "Ciências da Computação", "Introdução à programação e algoritmos.");
        this.tabela.add(disciplina3);
        Disciplina disciplina4 = new Disciplina(4, "Física", "Mecânica clássica e termodinâmica.");
        this.tabela.add(disciplina4);
        Disciplina disciplina5 = new Disciplina(5, "Inglês", "Aprendizado da língua inglesa.");
        this.tabela.add(disciplina5);
        Disciplina disciplina6 = new Disciplina(6, "Biologia", "Ecologia e genética.");
        this.tabela.add(disciplina6);
        Disciplina disciplina7 = new Disciplina(7, "Arte", "Exploração de diferentes formas de arte.");
        this.tabela.add(disciplina7);
        Disciplina disciplina8 = new Disciplina(8, "Química", "Química orgânica e inorgânica.");
        this.tabela.add(disciplina8);
        Disciplina disciplina9 = new Disciplina(9, "Economia", "Princípios econômicos básicos.");
        this.tabela.add(disciplina9);
        Disciplina disciplina10 = new Disciplina(10, "Literatura", "Grandes obras da literatura mundial.");
        this.tabela.add(disciplina10);
    }
}
