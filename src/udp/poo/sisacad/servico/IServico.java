package udp.poo.sisacad.servico;

import java.util.ArrayList;

public interface IServico<TDom>{
    public TDom inserir(TDom tupla);

    public TDom obter(int id);

    public ArrayList<TDom> listarTudo();

    public TDom atualizar(TDom tupla);

    public TDom excluir(int id);
}
