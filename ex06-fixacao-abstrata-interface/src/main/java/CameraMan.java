public class CameraMan extends Funcionario{

    private Integer qtdHoraExtra;
    private Double valorHoraExtra;

    //CONTRUTOR
    public CameraMan(String nome, Integer qtdProgramas, Double salarioBase, Integer qtdHoraExtra, Double valorHoraExtra) {
        super(nome, qtdProgramas, salarioBase);
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    //MÉTODO SOBRESCRITO
    @Override
    public Double calcSalario() {
        return getSalarioBase() + this.qtdHoraExtra * this.valorHoraExtra;
    }

    //TO STRING
    @Override
    public String toString() {
        return "CameraMan{" +
                "qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", salario=" + this.calcSalario() +
                "} " + super.toString();
    }
}
