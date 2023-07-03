public class DVD extends Produto{

    private String nome;
    private String gravadora;

    //CONSTRUTOR
    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    //MÉTODOS
    @Override
    public Double getValorVenda() {
        return getPrecoCusto() * 1.20;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", valor de venda='" + getValorVenda() + '\'' +
                "} " + super.toString();
    }

    //GETTERS SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }
}
