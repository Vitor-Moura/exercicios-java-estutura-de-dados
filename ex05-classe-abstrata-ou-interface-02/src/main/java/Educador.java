public abstract class Educador {

    private String nome;
    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    //CONSTRUTOR
    public Educador(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    //MÉTODO ABSTRATO
    public abstract Double getValorBonus();

    //GETTES E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdAulasSemana() {
        return qtdAulasSemana;
    }

    public void setQtdAulasSemana(Integer qtdAulasSemana) {
        this.qtdAulasSemana = qtdAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Educador{" +
                "nome='" + nome + '\'' +
                ", qtdAulasSemana=" + qtdAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                '}';
    }
}
