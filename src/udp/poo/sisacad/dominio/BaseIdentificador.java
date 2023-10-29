package udp.poo.sisacad.dominio;

public abstract class BaseIdentificador {

    protected long id;

    public BaseIdentificador() {
    }

    public BaseIdentificador(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}