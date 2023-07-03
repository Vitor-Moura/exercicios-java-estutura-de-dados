import java.util.ArrayList;
import java.util.List;

public class ControleBonus {
    List <Bonificavel> listaBonificaveis;

    //CONSTRUTOR
    public ControleBonus() {
        this.listaBonificaveis = new ArrayList<Bonificavel>();
    }

    //MÉTODOS
    public void adicionaBonificavel(Bonificavel b){
        listaBonificaveis.add(b);
    }

    public void exiveTodosBonificaveis(){
        for (Bonificavel b : listaBonificaveis) {
            System.out.println(b);
        }
    }

    public Double calculaTotalBonus(){
        Double total = 0.0;
        for (Bonificavel b : listaBonificaveis) {
            total += b.getValorBonus();
        }
        return total;
    }
}
