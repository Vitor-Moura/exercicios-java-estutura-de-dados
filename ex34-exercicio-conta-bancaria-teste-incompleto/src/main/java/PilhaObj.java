public class PilhaObj<T> {

    // Atributos
    private T[] pilha;
    private int topo;

    // Construtor
    public PilhaObj(int capacidade) {
        this.topo = -1;
        this.pilha = (T[]) new Object[capacidade];
    }

    // Métodos

    // Retorna true se a pilha estiver vazia e false caso contrário
    public Boolean isEmpty() {
        return topo == -1;
    }

    // Retorna true se a pilha estiver cheia e false caso contrário
    public Boolean isFull() {
        return topo == (pilha.length) -1;
    }

    // Se a pilha estiver cheia, deve lançar IllegalStateException
    // Se a pilha não estiver cheia, empilha info
    public void push(T info) {
        if (!isFull()){
            pilha[++topo] = info;
        }
        else {
            System.out.println("Lista cheia!");
            throw new IllegalStateException();
        }
    }

    // Desempilha e retorna o elemento do topo da pilha
    public T pop() {
        if (!isEmpty()){
            return pilha[topo--];
        }
        System.out.println("Pilha vazia!");
        return null;
    }

    // Retorna o elemento do topo da pilha, sem desempilhar
    public T peek() {
        if (!isEmpty()){
            return pilha[topo];
        }
        return null;
    }

    // Exibe o conteúdo da pilha
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }

}