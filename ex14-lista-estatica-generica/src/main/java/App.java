public class App {

    public static void main(String[] args) {

        ListaObj lista = new ListaObj(10);

        lista.adiciona("aaaaa");
        lista.adiciona("bbbbb");
        lista.adiciona("ccccc");
        lista.adiciona("ddddd");
        lista.adiciona("eeeee");
        lista.adiciona("fffff");
        lista.adiciona("ggggg");
        lista.adiciona("hhhhh");
        lista.adiciona("iiiii");
        lista.adiciona("jjjjj");


        //EXIBIR ELEMENTOS DA LISTA
        System.out.println("=".repeat(45));
        System.out.println("TODOS OS ELEMENTOS DA LISTA");
        lista.exibe();

        //EXIBIR ÍNDICE ATRAVÉS DO ELEMENTO DIGITADO
        System.out.println("=".repeat(45));
        System.out.println("EXIBE O ÍNDICE RELATIVO AO ELEMENTO DIGITADO");
        System.out.println(lista.busca("ccccc"));

        //REMOVER ELEMENTO ATRAVÉS DO ÍNDICE DIGITADO
        System.out.println("=".repeat(45));
        System.out.println("REMOVE ELEMENTO NO INDICE DIGITADO (2)");
        lista.removePeloIndice(2);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER PELO ÍNDICE");
        lista.exibe();

        //REMOVER ELEMENTO ATRAVÉS DO ELEMENTO
        System.out.println("=".repeat(45));
        System.out.println("REMOVE ELEMENTO DIGITADO (jjjjj)");
        lista.removeElemento("jjjjj");
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER PELO ELEMENTO");
        lista.exibe();

        //GET TAMANHO
        System.out.println("=".repeat(45));
        System.out.println("TAMANHO DO VETOR");
        System.out.println(lista.getTamanho());

        //GET ELEMENTO
        System.out.println("=".repeat(45));
        System.out.println("GET ELEMENTO 1");
        System.out.println(lista.getElemento(1));

        //LIMPA VETOR
        System.out.println("=".repeat(45));
        System.out.println("LIMPA VETOR");
        lista.limpa();
        lista.exibe();


    }
}
