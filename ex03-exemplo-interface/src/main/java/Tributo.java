import java.util.ArrayList;
import java.util.List;

public class Tributo {

    List<Tributavel> listaTributaveis;

    //Construtor
    public Tributo() {

        this.listaTributaveis = new ArrayList<Tributavel>();
    }

    //Métodos
    public void adicionaTributavel(Tributavel t){
        listaTributaveis.add(t);
    }

    public Double calculaTotalTributo(){
        Double total = 0.0;
        for (Tributavel t : listaTributaveis) {
            total += t.getValorTributo();
        }
        return total;
    }

    public void exibeTodos(){
        for (Tributavel t : listaTributaveis) {
            System.out.println(t);
        }
    }
}
