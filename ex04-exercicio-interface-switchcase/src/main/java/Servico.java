public class Servico implements Vendavel{

    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;

    //CONSTRUTOR
    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    //MÉTODOS
    @Override
    public Double getValorVenda() {
        return this.quantHoras * this.valorHora;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", codigo=" + codigo +
                ", quantHoras=" + quantHoras +
                ", vslorHora=" + valorHora +
                ", valor de venda='" + getValorVenda() + '\'' +
                '}';
    }

    //GETTERS SETTERS
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(Integer quantHoras) {
        this.quantHoras = quantHoras;
    }

    public Double getVslorHora() {
        return valorHora;
    }

    public void setVslorHora(Double vslorHora) {
        this.valorHora = vslorHora;
    }
}
