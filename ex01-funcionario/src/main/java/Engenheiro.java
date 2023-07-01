public class Engenheiro extends Funcionario{
    //Atributo
    private Double salario;

    //Construtor
    public Engenheiro(String cpf, String nome, Double salario) {
        super(cpf, nome);
        this.salario = salario;
    }

    //Implementação do método abstrato
    @Override
    public Double calcSalario() {
        return this.salario;
    }

    //toString
    @Override
    public String toString() {
        return "Engenheiro{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
