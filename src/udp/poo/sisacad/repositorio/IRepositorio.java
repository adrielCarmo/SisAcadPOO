package udp.poo.sisacad.repositorio;

public interface IRepositorio<TDom> {
    public TDom create(TDom instancia);
    public TDom read(int id);
    public TDom update(TDom instancia);
    public TDom delete(int id);
}
