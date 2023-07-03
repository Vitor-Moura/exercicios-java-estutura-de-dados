public abstract class Aluno {
    private Integer ra;
    private String nome;

    //CONSTRUTOR
    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    //MÉTODOS
    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + nome + '\'' +
                '}';
    }

    //GETTERS
    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }
}
