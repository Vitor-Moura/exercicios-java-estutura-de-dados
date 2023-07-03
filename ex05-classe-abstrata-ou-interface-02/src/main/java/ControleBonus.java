import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    List <Educador> listaEducadores;

    //CONSTRUTOR
    public ControleBonus() {
        this.listaEducadores = new ArrayList<Educador>();
    }

    //MÉTODOS
    public void adicionaEducador(Educador e){
        listaEducadores.add(e);
    }

    public void exibeTodosEducadores(){
        for (Educador e: listaEducadores) {
            System.out.println(e);
        }
    }

    public Double calculaTotalBonus(){
        Double total = 0.0;
        for (Educador e: listaEducadores) {
            total += e.getValorBonus();
        }
        return total;
    }
}
