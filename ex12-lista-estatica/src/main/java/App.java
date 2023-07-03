public class App {

    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica(5);

        lista.adiciona(10);
        lista.adiciona(11);
        lista.adiciona(12);
        lista.adiciona(13);
        lista.adiciona(14);

        //EXIBIR ELEMENTOS DA LISTA
        System.out.println("=".repeat(45));
        System.out.println("TODOS OS ELEMENTOS DA LISTA");
        lista.exibe();

        //EXIBIR ÍNDICE ATRAVÉS DO ELEMENTO DIGITADO
        System.out.println("=".repeat(45));
        System.out.println("EXIBE O ÍNDICE RELATIVO AO ELEMENTO DIGITADO (13)");
        System.out.println(lista.busca(13));

        //REMOVER ELEMENTO ATRAVÉS DO ÍNDICE DIGITADO
        System.out.println("=".repeat(45));
        System.out.println("REMOVE ELEMENTO NO INDICE DIGITADO (2)");
        lista.removePeloIndice(2);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER PELO ÍNDICE");
        lista.exibe();

        //REMOVER ELEMENTO ATRAVÉS DO ELEMENTO
        System.out.println("=".repeat(45));
        System.out.println("REMOVE ELEMENTO DIGITADO (14)");
        lista.removeElemento(14);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER PELO ELEMENTO");
        lista.exibe();
    }
}
