public class Alimento extends Produto{

    private Integer quantVitamina;


    //Construtor
    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.quantVitamina = quantVitamina;
    }

    //Métodos
    @Override
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "quantVitamina=" + quantVitamina +
                "} " + super.toString();
    }
}
