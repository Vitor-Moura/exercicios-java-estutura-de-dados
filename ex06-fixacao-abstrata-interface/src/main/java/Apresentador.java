public class Apresentador extends Funcionario implements Bonificavel{

    private Double valorDireitoDeImagem;

    //CONSTRUTOR
    public Apresentador(String nome, Integer qtdProgramas, Double salarioBase, Double valorDireitoDeImagem) {
        super(nome, qtdProgramas, salarioBase);
        this.valorDireitoDeImagem = valorDireitoDeImagem;
    }

    //MÉTODO SOBRESCRITO DA CLASSE MÃE
    @Override
    public Double calcSalario() {
        return getSalarioBase() + getQtdProgramas() * 1000;
    }

    //MÉTODO IMPLEMENTADO DA INTERFACE
    @Override
    public Double getValorBonus() {
        return this.valorDireitoDeImagem * getQtdProgramas();
    }

    //TO STRING
    @Override
    public String toString() {
        return "Apresentador{" +
                "valorDireitoDeImagem=" + valorDireitoDeImagem +
                ", salario=" + this.calcSalario() +
                ", bônus=" + this.getValorBonus() +
                "} " + super.toString();
    }
}
