public abstract class Produto implements Tributavel{

    //atributos
    private Integer codigo;
    private String descricao;
    private Double preco;

    //Construtor
    public Produto(Integer codigo, String descricao, Double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Métodos
    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", tributo=" + getValorTributo() +
                '}';
    }
}
