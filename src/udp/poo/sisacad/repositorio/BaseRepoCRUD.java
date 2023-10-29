package udp.poo.sisacad.repositorio;

import java.util.ArrayList;

public abstract class BaseRepoCRUD<TFakeDB, TDom> {
    protected TFakeDB db;
    protected ArrayList<TDom> dataset;

    public abstract TDom create(TDom instancia);

    public abstract TDom read(Long id);

    public ArrayList<TDom> readAll(){
        return this.dataset;
    }

    public abstract TDom update(TDom instancia);

    public abstract TDom delete(Long id);
}
