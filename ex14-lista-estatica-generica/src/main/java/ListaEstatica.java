public class ListaEstatica {

    private int[] vetor;
    private int nroElem;

//    CONSTRUTOR
    public ListaEstatica(int capacidade) {
        this.vetor = new int[capacidade];
        this.nroElem = 0;
    }

//    MÉTODOS
//    Adiciona:
//    Recebe o elemento a ser inserido
//    Se o vetor estiver “cheio”, exibe uma mensagem de “Lista cheia”
    public void adiciona(Integer elemento) {
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia");
        } else {
            vetor[nroElem++] = elemento;
        }
    }

//    Exibe:
//    Exibe os elementos da lista
    public void exibe() {
        if (nroElem == 0) {
            System.out.println("\nLista vazia.");
        } else {
            for (int i = 0; i < nroElem; i++) {
                System.out.print(vetor[i] + "\t");
            }
            System.out.println();
        }
    }

//    Busca
//    Recebe o elemento a ser procurado
//    Devolve o índice do vetor onde está o elemento ou -1 se não encontrou
    public int busca(Integer elementoProcurado) {
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                return i;
            }
        }
        return -1;
    }

//    Remove pelo índice:
//    Recebe o índice do elemento a ser removido
//    Devolve true se removeu ou false se índice inválido
    public boolean removePeloIndice(Integer indiceDigitado) {
        if (indiceDigitado < 0 || indiceDigitado >= vetor.length) {
            return false;
        }
        for (int i = indiceDigitado; i < nroElem - 1; i++) {
            vetor[i] = vetor[i + 1];
        }
        nroElem--;
        return true;
    }

//    Remove elemento
//    Recebe o elemento a ser removido
//    Procura o elemento a ser removido
//    Devolve true se removeu e false se não encontrou
    public boolean removeElemento(Integer elementoDigitado) {
        boolean removido = false;

        if (busca(elementoDigitado) == -1) {
            return removido;
        }
        return removePeloIndice(busca(elementoDigitado));
    }

//    Substitui:
//    Este método deve ser do tipo boolean e deve receber 2 argumentos: o valor antigo e o valor novo (ambos inteiros)
//    O método deve procurar o valor antigo na lista e, se encontrar, deve substituí-lo pelo valor novo e retornar true
//    Se o valor antigo não for encontrado, deve exibir uma mensagem de “valor não encontrado” e retornar false
    public boolean substitui(Integer valorAntigo, Integer valorNovo){
        if (busca(valorAntigo) == -1) {
            System.out.println("Valor não encontrado");
            return false;
        }
        vetor[busca(valorAntigo)] = valorNovo;
        return true;
    }

//    contaOcorrencias:
//    Este método deve ser do tipo inteiro e deve receber um valor inteiro.
//    O método deve “contar” quantas vezes o valor recebido como argumento aparece na lista e deve retornar essa quantidade
    public int contaOcorrencias(Integer elementoProcurado){
        int contador = 0;
        for (int i = 0; i < nroElem; i++) {
            if (vetor[i] == elementoProcurado) {
                contador ++;
            }
        }
        return contador;
    }

//    adicionaNoInicio
//    Este método deve ser do tipo boolean e deve receber um valor inteiro que será adicionado no início da lista.
//    O método deve exibir a mensagem “Lista cheia” se a lista estiver cheia.
//    Senão, deve inserir o valor recebido como argumento no início da lista, no índice zero, deslocando para frente os
//    valores que já estão na lista.
    public boolean adicionaNoInicio(Integer elementoInserido){
        if (nroElem >= vetor.length) {
            System.out.println("Lista cheia");
            return false;
        } else {
            for (int i = vetor.length-1; i > 0; i--) {
                vetor[i] = vetor[i-1];
            }
            vetor [0] = elementoInserido;
        }
        nroElem++;
        return true;
    }


}


