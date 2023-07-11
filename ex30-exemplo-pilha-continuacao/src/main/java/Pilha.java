import java.util.Stack;

public class Pilha {

    private int topo;
    private int[] pilha;

    public Pilha(int capacidade) {
        this.topo = -1;
        this.pilha = new int [capacidade];
    }

    public boolean isEmpty() {
        return topo == -1;
//        if (topo == -1) {
//            return true;
//        }
//        return false;
    }

    public boolean isFull() {
        return topo == pilha.length -1;
//        if (topo == (pilha.length -1)){
//            return true;
//        }
//        return false;
    }

    public void push(int info) {
        if (!isFull()){
            pilha[++topo] = info;
        }
        else {
            System.out.println("Pilha cheia!");
        }
    }

    public int pop(){
        if (!isEmpty()){
            //primeiro retorna o elemento do topo e depois decrementa o índice
            return pilha[topo--];
        }
        return -1;
    }

    public int peek(){
        if (!isEmpty()){
            return pilha[topo];
        }
        return -1;
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

    public boolean isPalidromo(Pilha p){
        for (int i = 0; i < topo; i++) {
            if (pilha[i] != p.pop()){
                return false;
            }
        }
        return true;
    }

    public int getTopo() {
        return topo;
    }

    public int getTamanho() {
        return pilha.length;
    }
}
