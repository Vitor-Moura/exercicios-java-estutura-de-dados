public class Professor implements Bonificavel{
    private String nome;
    private Integer qtdAulasSemana;
    private Double valorHoraAula;

    //CONSTRUTOR
    public Professor(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        this.nome = nome;
        this.qtdAulasSemana = qtdAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }

    //MÉTODO IMPLEMENTADO DE BONIFICÁVEL
    @Override
    public Double getValorBonus() {
        return qtdAulasSemana * valorHoraAula * 4.5 * 0.15;
    }

    //GETTERS E SETTERS
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
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", qtdAulasSemana=" + qtdAulasSemana +
                ", valorHoraAula=" + valorHoraAula +
                '}';
    }
}
