package udp.poo.sisacad.repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TFakeDB, TDom> implements IRepositorio<TDom>{
    protected TFakeDB db;
    protected ArrayList<TDom> dataset;

    public BaseRepositorio() {
    }

    public TFakeDB getDb() {
        return db;
    }

    public void setDb(TFakeDB db) {
        this.db = db;
    }

    public ArrayList<TDom> getDataset() {
        return dataset;
    }

    public void setDataset(ArrayList<TDom> dataset) {
        this.dataset = dataset;
    }

    public ArrayList<TDom> readAll() {
        return this.dataset;
    }
}
