public class ListaEstaticaOrdenada extends ListaEstatica{


    public ListaEstaticaOrdenada(int capacidade) {

        super(capacidade);
    }

    @Override
    public void adiciona(Integer elemento) {
        if(nroElem != vetor.length){
            int posInser = nroElem;
            for (int i = 0; i < nroElem; i++) {
                if(elemento < vetor[i]){
                    posInser = i;
                    for(int j = nroElem; j > i; j--){
                        vetor[j] = vetor[j-1];
                    }
                    vetor[posInser] = elemento;
                    nroElem++;
                    return;
                }
            }
            vetor[posInser] = elemento;
            nroElem++;

        }else{
            System.out.println("Lista Cheia");
        }
    }
}
