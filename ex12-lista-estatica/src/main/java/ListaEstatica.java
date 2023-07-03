public class ListaEstatica {

    private int[] vetor;
    private int nroElem;

    //CONSTRUTOR
    public ListaEstatica(int capacidade) {
        this.vetor = new int[capacidade];
        this.nroElem = 0;
    }

    //MÉTODOS
    //Recebe o elemento a ser inserido
    //Se o vetor estiver “cheio”, exibe uma mensagem de “Lista cheia”
    public void adiciona(Integer elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia");
        } else {
            vetor[nroElem++] = elemento;
        }
    }

    //Exibe os elementos da lista
    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nA lista está vazia.");
        } else {
            System.out.println("\nElementos da lista:");
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            }
            System.out.println();
        }
    }

    //Recebe o elemento a ser procurado
    //Devolve o índice do vetor onde está o elemento ou -1 se não encontrou
    public int busca(Integer elementoProcurado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                return i;
            }
        }
        return -1;
    }

    //Recebe o índice do elemento a ser removido
    //Devolve true se removeu ou false se índice inválido
    public boolean removePeloIndice(Integer indiceDigitado) {
        if (indiceDigitado < 0 || indiceDigitado >= nroElem) {
            System.out.println("\nÍndice inválido!");
            return false;
        }
        for (int i = indiceDigitado; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElem--;
        return true;
    }

    //Recebe o elemento a ser removido
    //Procura o elemento a ser removido
    //Devolve true se removeu e false se não encontrou
    public boolean removeElemento(Integer elementoDigitado) {
        boolean removido = false;

        if (busca(elementoDigitado) == -1) {
            return removido;
        }
        return removePeloIndice(busca(elementoDigitado));
    }


}


