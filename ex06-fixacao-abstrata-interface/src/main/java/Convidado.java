public class Convidado implements Bonificavel{

    private String nome;
    private Integer minutosNoAr;
    private Double valorDireitoDeImagem;

    //CONSTRUTOR
    public Convidado(String nome, Integer minutosNoAr, Double valorDireitoDeImagem) {
        this.nome = nome;
        this.minutosNoAr = minutosNoAr;
        this.valorDireitoDeImagem = valorDireitoDeImagem;
    }

    //MÉTODO IMPLEMENTADO
    @Override
    public Double getValorBonus() {
        return this.minutosNoAr * this.valorDireitoDeImagem;
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", minutosNoAr=" + minutosNoAr +
                ", valorDireitoDeImagem=" + valorDireitoDeImagem +
                ", bônus=" + this.getValorBonus() +
                '}';
    }
}
