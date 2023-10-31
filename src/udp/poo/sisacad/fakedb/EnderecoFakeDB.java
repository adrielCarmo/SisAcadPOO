package udp.poo.sisacad.fakedb;

import udp.poo.sisacad.dominio.Endereco;

import java.text.ParseException;

public class EnderecoFakeDB extends BaseFakeDB <Endereco> {

    public EnderecoFakeDB() throws ParseException {
        super();
    }

    @Override
    protected void carregarDados() throws ParseException {
        this.tabela.add(new Endereco(1L, "Av. Ceará", "Centro",1052,"79033123","Campo Grande","MS"));
        this.tabela.add(new Endereco(2L, "Rua Joaquim Murtinho", "Centro",4212,"79043123","Campo Grande","MS"));
        this.tabela.add(new Endereco(3L, "Av. Sol da Manhã", "Catedral",88,"85643094","Foz do Iguaçu","PR"));
        this.tabela.add(new Endereco(4L, "Rua José Pereira", "Moreninha",111,"79021223","Campo Grande","MS"));
        this.tabela.add(new Endereco(5L, "Av. Luiz Antonio", "Sapopembo",22,"04376857","Rio de Janeiro","RJ"));
    }
}
