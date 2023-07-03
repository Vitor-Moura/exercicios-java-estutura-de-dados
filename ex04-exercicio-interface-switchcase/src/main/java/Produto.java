public abstract class Produto implements Vendavel{

    private Integer codigo;
    private Double precoCusto;

    //CONSTRUTOR
    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    //GETTERS SETTERS
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", precoCusto=" + precoCusto +
                '}';
    }
}
