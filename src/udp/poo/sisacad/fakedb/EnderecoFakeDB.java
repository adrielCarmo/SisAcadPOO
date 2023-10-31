package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Endereco;

import java.text.ParseException;

public class EnderecoFakeDB extends BaseFakeDB<Endereco>{
    public EnderecoFakeDB() throws ParseException {
        super();
    }

    @Override
    protected void carregarDados() throws ParseException {
        Endereco endereco1 = new Endereco(1, "Rua A", "Bairro1", 123, "12345-678", "Cidade1", "SP");
        this.tabela.add(endereco1);
        Endereco endereco2 = new Endereco(2, "Rua B", "Bairro2", 456, "98765-432", "Cidade2", "RJ");
        this.tabela.add(endereco2);
        Endereco endereco3 = new Endereco(3, "Rua C", "Bairro3", 789, "54321-876", "Cidade3", "MG");
        this.tabela.add(endereco3);
        Endereco endereco4 = new Endereco(4, "Rua D", "Bairro4", 101, "13579-246", "Cidade4", "RS");
        this.tabela.add(endereco4);
        Endereco endereco5 = new Endereco(5, "Rua E", "Bairro5", 202, "86420-159", "Cidade5", "BA");
        this.tabela.add(endereco5);
        Endereco endereco6 = new Endereco(6, "Rua A", "Bairro1", 123, "12345-678", "Cidade1", "SP");
        this.tabela.add(endereco6);
        Endereco endereco7 = new Endereco(7, "Rua B", "Bairro2", 456, "98765-432", "Cidade2", "RJ");
        this.tabela.add(endereco7);
        Endereco endereco8 = new Endereco(8, "Rua C", "Bairro3", 789, "54321-876", "Cidade3", "MG");
        this.tabela.add(endereco8);
        Endereco endereco9 = new Endereco(9, "Rua D", "Bairro4", 101, "13579-246", "Cidade4", "RS");
        this.tabela.add(endereco9);
        Endereco endereco10 = new Endereco(10, "Rua E", "Bairro5", 202, "86420-159", "Cidade5", "BA");
        this.tabela.add(endereco10);
    }
}
