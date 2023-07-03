public class Coordenador extends Educador{

    private Integer qtdHorasCoord;
    private Double valorHoraCoord;

    //CONSTRUTOR
    public Coordenador(String nome, Integer qtdAulasSemana, Double valorHoraAula, Integer qtdHorasCoord, Double valorHoraCoord) {
        super(nome, qtdAulasSemana, valorHoraAula);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
    }

    //MÉTODO HERDADO
    @Override
    public Double getValorBonus() {
        return  (getQtdAulasSemana() * getValorHoraAula() * 4.5 * 0.15)
                + (this.qtdHorasCoord * this.valorHoraCoord * 4.5 * 0.2);
    }

    //TO STRING
    @Override
    public String toString() {
        return "Coordenador{" +
                "qtdHorasCoord=" + qtdHorasCoord +
                ", valorHoraCoord=" + valorHoraCoord +
                "} " + super.toString();
    }
}
