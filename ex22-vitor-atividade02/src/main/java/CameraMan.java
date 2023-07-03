public class CameraMan {
    private int id;
    private String nome;
    private Double valorSalario;
    private Integer qtdHoraExtra;
    private Double valorHoraExtra;
    private Integer qtdProgramas;

    public CameraMan(int id, String nome, Double valorSalario, Integer qtdHoraExtra,
                     Double valorHoraExtra, Integer qtdProgramas) {
        this.id = id;
        this.nome = nome;
        this.valorSalario = valorSalario;
        this.qtdHoraExtra = qtdHoraExtra;
        this.valorHoraExtra = valorHoraExtra;
        this.qtdProgramas = qtdProgramas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(Double valorSalario) {
        this.valorSalario = valorSalario;
    }

    public Integer getQtdHoraExtra() {
        return qtdHoraExtra;
    }

    public void setQtdHoraExtra(Integer qtdHoraExtra) {
        this.qtdHoraExtra = qtdHoraExtra;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public Integer getQtdProgramas() {
        return qtdProgramas;
    }

    public void setQtdProgramas(Integer qtdProgramas) {
        this.qtdProgramas = qtdProgramas;
    }

    @Override
    public String toString() {
        return "CameraMan{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valorSalario=" + valorSalario +
                ", qtdHoraExtra=" + qtdHoraExtra +
                ", valorHoraExtra=" + valorHoraExtra +
                ", qtdProgramas=" + qtdProgramas +
                '}';
    }
}
