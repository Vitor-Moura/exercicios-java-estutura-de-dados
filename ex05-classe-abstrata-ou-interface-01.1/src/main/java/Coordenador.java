public class Coordenador implements Bonificavel{
    private String nome;
    private Integer getHorasSemana;
    private Double valorHoraCoord;

    //CONSTRUTOR
    public Coordenador(String nome, Integer getHorasSemana, Double valorHoraCoord) {
        this.nome = nome;
        this.getHorasSemana = getHorasSemana;
        this.valorHoraCoord = valorHoraCoord;
    }

    //MÉTODO IMPLEMENTADO DE BONIFICÁVEL
    @Override
    public Double getValorBonus() {
        return getHorasSemana * getValorHoraCoord() * 4.5 * 0.2;
    }

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getGetHorasSemana() {
        return getHorasSemana;
    }

    public void setGetHorasSemana(Integer getHorasSemana) {
        this.getHorasSemana = getHorasSemana;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Coordenador{" +
                "nome='" + nome + '\'' +
                ", getHorasSemana=" + getHorasSemana +
                ", valorHoraCoord=" + valorHoraCoord +
                '}';
    }
}
