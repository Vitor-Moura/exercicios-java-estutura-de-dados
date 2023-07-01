import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Funcionario> lista;

    //Construtor
    public Empresa(){
        lista = new ArrayList<Funcionario>();
    }

    //Métodos
    public void adicionaFunc(Funcionario f) {
        lista.add(f);
    }

    public void exibeTodos() {
        System.out.println("\nLista de Funcionários");
        for (Funcionario  f: lista) {
            System.out.println(f);
        }
    }

    public void exibeTotalSalario() {
        Double total = 0.0;
        for (Funcionario f : lista){
            total += f.calcSalario();
        }
        System.out.println("\nTotal dos Salários: "+
        String.format("R$ %.2f", total));
    }

    public void exibeHorista(){
        System.out.println("\nLista de Horistas");
        for (Funcionario  f: lista) {
            if (f instanceof Horista) {
                System.out.println(f);
            }
        }
    }

    public void buscaFunc(String cpf) {
        System.out.println("\nBuscando funcionário pelo CPF");
        boolean achou = false;
        for (Funcionario f : lista) {
            if (f.getCpf().equals(cpf)) {
                System.out.println(f);
                achou = true;
            }

        }
        if (!achou) {
            System.out.println("Não encontrado");
        }
    }
}
