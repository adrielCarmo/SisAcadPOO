package udp.poo.sisacad.fakedb;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public abstract class BaseFakeDB<TDom> {
    protected ArrayList<TDom> tabela;
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public BaseFakeDB(){
        this.tabela = new ArrayList<TDom>();
        this.carregarDados();
    }

    public ArrayList<TDom> getTabela() {
        if(this.tabela == null) {
            this.tabela = new ArrayList<TDom>();
        }
        return this.tabela;
    }

    public void setTabela(ArrayList<TDom> tabela) {
        this.tabela = tabela;
    }

    protected abstract void carregarDados();
}
