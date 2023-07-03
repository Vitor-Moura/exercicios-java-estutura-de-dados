import java.util.ArrayList;
import java.util.List;

public class Escola {

    private String nome;
    private List<Aluno> lista;

    //CONSTRUTOR
    public Escola(String nome) {
        this.nome = nome;
        this.lista = new ArrayList<Aluno>();
    }

    //MÉTODOS
    public void adicionaAluno(Aluno a){
        lista.add(a);
    }

    public void exibeTodos() {
        System.out.println("=".repeat(35));
        System.out.println("\nTODOS OS ALUNOS");
        for (Aluno a: lista) {
            System.out.println(a);
        }
    }

    public void exibeAlunoGraduacao(){
        System.out.println("=".repeat(35));
        System.out.println("\nALUNOS GRADUAÇÃO");
        for (Aluno  a: lista) {
            if (a instanceof AlunoGraduacao) {
                System.out.println(a);
            }
        }
    }

    public void exibeAprovados(){
        System.out.println("=".repeat(35));
        System.out.println("\nALUNOS APROVADOS");
        for (Aluno  a: lista) {
            if (a.calculaMedia() >= 6.0) {
                System.out.println(a);
            }
        }
    }

    public void buscaAluno(Integer ra){
        System.out.println("=".repeat(35));
        System.out.println("\nBUSCANDO ALUNO PELO RA");
        for (Aluno a : lista) {
            if (a.getRa().equals(ra)){
                System.out.println(a);
                // return encerra o método e volta pra onde ele foi chamado
                // nessa caso na classe TestaAluno
                return;
            }
        }
        System.out.println("Aluno não encontrado");
    }


}
