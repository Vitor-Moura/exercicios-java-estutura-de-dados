public abstract class Funcionario {

    private String nome;
    private Integer qtdProgramas;
    private Double salarioBase;


    //CONSTRUTOR
    public Funcionario(String nome, Integer qtdProgramas, Double salarioBase) {
        this.nome = nome;
        this.qtdProgramas = qtdProgramas;
        this.salarioBase = salarioBase;
    }

    //MÉTODO ABSTRATO
    public abstract Double calcSalario();

    //GETTERS E SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdProgramas() {
        return qtdProgramas;
    }

    public void setQtdProgramas(Integer qtdProgramas) {
        this.qtdProgramas = qtdProgramas;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }


    //TO STRING
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", qtdProgramas=" + qtdProgramas +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
