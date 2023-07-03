public class Professor extends Educador{

    //CONSTRUTOR
    public Professor(String nome, Integer qtdAulasSemana, Double valorHoraAula) {
        super(nome, qtdAulasSemana, valorHoraAula);
    }

    //MÉTODO HERDADO
    @Override
    public Double getValorBonus() {
        return getQtdAulasSemana() * getValorHoraAula() * 4.5 * 0.15;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Professor{} " + super.toString();
    }
}
