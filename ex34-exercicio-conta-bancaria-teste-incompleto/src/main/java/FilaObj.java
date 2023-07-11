public class FilaObj<T> {

    // Atributos
    private int tamanho;
    private T[] fila;

    // Construtor
    public FilaObj(int capacidade) {
        this.fila = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    // Métodos

    // Retorna true se a fila está vazia e false coso contrário
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Retorna true se a fila está cheia e false caso contrário
    public boolean isFull() {
        return fila.length == tamanho;
    }

    // Se a fila não estiver cheia, insere info na fila
    // Se a fila estiver cheia, deve lançar IllegalStateException
    public void insert(T info) {
        if (isFull()){
            throw new IllegalStateException("Fila Cheia!");
        }
        fila [tamanho++]  = info;
    }

    // Retorna o primeiro da fila
    public T peek() {
        return fila[0];
    }

    // Remove e retorna o primerio elemento da fila
    // Antes de retorna, se a fila não estiver vazia, deve fazer a fila "andar"
    public T poll() {
        T primeiroObjeto;
        if (!isEmpty()){
            primeiroObjeto = peek();
            for (int i = 0; i < tamanho -1 ; i++) {
                fila[i] = fila[i+1];
            }
            fila[tamanho -1] = null;
            tamanho--;
            return primeiroObjeto;
        }
        return null;
    }

    // Exibe os elementos da fila
    public void exibe() {
        if (isEmpty()){
            System.out.println("Fila vazia");
        }
        for (int i = 0; i < tamanho; i++) {
            System.out.println(fila[i]);
        }
    }

    // Retorna o vetor fila
    public T[] getFila() {
        return fila;
    }


    public int getTamanho() {
        return tamanho;
    }
}