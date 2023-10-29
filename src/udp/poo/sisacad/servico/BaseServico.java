package udp.poo.sisacad.servico;

import java.util.ArrayList;

public abstract class BaseServico<TRepo, TDom> {
    protected TRepo repo;

    public BaseServico() {
    }

    public abstract TDom inserir(TDom tupla);

    public abstract TDom obter(Long id);

    public abstract ArrayList<TDom> listar();

    public abstract TDom atualizar(TDom tupla);

    public abstract TDom deletar(Long id);
}
