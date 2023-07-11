public class PilhaObj <T>{

    private int topo;
    private T[] pilha;

    public PilhaObj(int tamanho) {
        this.topo = -1;
        this.pilha = (T[]) new Object[tamanho];
    }

    public boolean isEmpty(){
        return topo == -1;
    }

    public boolean isFull(){
        return topo == (pilha.length) -1;
    }

    public void push(T info){
        if (!isFull()){
            pilha[++topo] = info;
        }
        else {
            System.out.println("Lista cheia!");
        }
    }

    public T pop(){
        if (!isEmpty()){
            //primeiro retorna o elemento do topo e depois decrementa o índice
            return pilha[topo--];
        }
        System.out.println("Pilha vazia!");
        return null;
    }

    public T peek(){
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

    public void exibeEmLinha() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.print(pilha[i]);
            }
        }
    }

    public int getTamanho() {
        return pilha.length;
    }
}
