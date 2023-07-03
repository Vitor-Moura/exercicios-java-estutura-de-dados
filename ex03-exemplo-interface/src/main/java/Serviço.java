public class Serviço implements Tributavel{

    private String descricao;
    private Double preco;

    //Construtor
    public Serviço(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    //Métodos
    @Override
    public Double getValorTributo() {
        return this.preco * 0.12;
    }

    @Override
    public String toString() {
        return "Serviço{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", tributo=" + getValorTributo() +
                '}';
    }


}
