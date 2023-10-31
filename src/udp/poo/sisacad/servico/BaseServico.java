package udp.poo.sisacad.servico;

import java.util.ArrayList;

public abstract class BaseServico<TRepo, TDom> implements IServico<TDom>{
    protected TRepo repo;

    public BaseServico() {
    }

    public TRepo getRepo() {
        return repo;
    }

    public void setRepo(TRepo repo) {
        this.repo = repo;
    }
}
