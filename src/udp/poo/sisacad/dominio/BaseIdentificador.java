package udp.poo.sisacad.dominio;

public abstract class BaseIdentificador {
    protected int id;

    public BaseIdentificador() {
    }

    public BaseIdentificador(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
