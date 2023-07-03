public class App {

    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica(10);

        lista.adiciona(10);
        lista.adiciona(11);
        lista.adiciona(12);
        lista.adiciona(13);
        lista.adiciona(14);
        lista.adiciona(15);
        lista.adiciona(16);
        lista.adiciona(17);
        lista.adiciona(18);
        lista.adiciona(19);


        //EXIBIR ELEMENTOS DA LISTA
        System.out.println("=".repeat(45));
        System.out.println("TODOS OS ELEMENTOS DA LISTA");
        lista.exibe();

        //EXIBIR ÍNDICE ATRAVÉS DO ELEMENTO DIGITADO (14)
        System.out.println("=".repeat(45));
        System.out.println("EXIBE O ÍNDICE RELATIVO AO ELEMENTO DIGITADO (14)");
        System.out.println(lista.busca(14));

        //REMOVER ELEMENTO ATRAVÉS DO ÍNDICE DIGITADO (2)
        System.out.println("=".repeat(45));
        System.out.println("REMOVE ELEMENTO NO INDICE DIGITADO (2)");
        lista.removePeloIndice(2);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER PELO ÍNDICE");
        lista.exibe();

        //REMOVER ELEMENTO ATRAVÉS DO ELEMENTO (14)
        System.out.println("=".repeat(45));
        System.out.println("REMOVE ELEMENTO DIGITADO (14)");
        lista.removeElemento(14);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER PELO ELEMENTO");
        lista.exibe();

        //SUBISTITUIR VALOR ANTIGO PELO  (20-17) (19-10)
        System.out.println("=".repeat(45));
        System.out.println("SUBISTITUI ELEMENTO INVÁLIDO (20-17)");
        lista.substitui(20, 17);
        System.out.println("SUBISTITUI ELEMENTO VÁLIDO (19-10)");
        lista.substitui(19, 10);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE REMOVER SUBSTITUIR");
        lista.exibe();

        //CONTAR OCORRÊNCIAS DE UM ELEMENTO ESPECÍTICO (10)
        System.out.println("=".repeat(45));
        System.out.println("QUANTIDADE DE OCORRÊNCIAS DE UM ELEMENTO (10)");
        System.out.println(lista.contaOcorrencias(10));

        //ADICIONAR NO INÍCIO
        System.out.println("=".repeat(45));
        System.out.println("ADICIONA NO INÍCIO DO VETOR");
        lista.adicionaNoInicio(99);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE ADICIONAR 99 NO INÍCIO");
        lista.exibe();
        lista.adicionaNoInicio(98);
        System.out.println("MOSTRA TODOS OS ELEMENTOS DA LISTA DEPOIS DE ADICIONAR 98 NO INÍCIO");
        lista.exibe();
        System.out.println("TENTA ADICIONAR 97 NO INÍCIO");
        lista.adicionaNoInicio(97);


        ListaEstatica listaOrdenada = new ListaEstaticaOrdenada(10);

        listaOrdenada.adiciona(7);
        listaOrdenada.adiciona(5);
        listaOrdenada.adiciona(2);
        listaOrdenada.adiciona(4);
        listaOrdenada.adiciona(1);
        listaOrdenada.adiciona(3);
        listaOrdenada.adiciona(6);

        System.out.println("=".repeat(45));
        System.out.println("EXIBE LISTA ORDENADA");
        listaOrdenada.exibe();


    }
}
