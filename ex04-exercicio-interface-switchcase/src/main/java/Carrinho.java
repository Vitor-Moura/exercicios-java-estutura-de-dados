import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List <Vendavel> listaVendaveis;

    //CONSTRUTOR
    public Carrinho() {
        this.listaVendaveis = new ArrayList<Vendavel>();
    }

    //MÉTODOS
    public void adicionaVendavel(Vendavel v){
        listaVendaveis.add(v);
    }

    public Double calculaTotalVenda(){
        Double total = 0.0;
        for (Vendavel v : listaVendaveis) {
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        for (Vendavel v: listaVendaveis) {
            System.out.println(v);
        }
    }
}
