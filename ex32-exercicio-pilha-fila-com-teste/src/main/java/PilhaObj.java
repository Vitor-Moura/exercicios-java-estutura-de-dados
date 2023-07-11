public class PilhaObj<T> {

    private T[] pilha;
    private int topo;

    public PilhaObj(int capacidade) {
        this.topo = -1;
        this.pilha = (T[]) new Object[capacidade];
    }

    public Boolean isEmpty() {
        return topo == -1;
    }

    public Boolean isFull() {
        return topo == (pilha.length) -1;
    }

    public void push(T info) {
        if (!isFull()){
            pilha[++topo] = info;
        }
        else {
            System.out.println("Lista cheia!");
            throw new IllegalStateException();
        }
    }

    public T pop() {
        if (!isEmpty()){
            return pilha[topo--];
        }
        System.out.println("Pilha vazia!");
        return null;
    }

    public T peek() {
        if (!isEmpty()){
            return pilha[topo];
        }
        return null;
    }

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
