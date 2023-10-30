package udp.poo.sisacad.dominio;

public class Endereco extends BaseIdentificador{
    
    private String logradouro;
    private String bairro;
    private int num;
    private String cep;
    private String cidade;
    private String siglaEstado;

    public Endereco() {
    }

    public Endereco(long id, String logradouro, String bairro, int num, String cep, String cidade, String siglaEstado) {
        super(id);
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.num = num;
        this.cep = cep;
        this.cidade = cidade;
        this.siglaEstado = siglaEstado;
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

}