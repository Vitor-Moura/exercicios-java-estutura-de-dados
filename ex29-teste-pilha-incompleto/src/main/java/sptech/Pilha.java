package sptech;

public class Pilha {

    // 01) Atributos
    private int[] pilha;
    private int topo;

    // 02) Construtor
    public Pilha(int capacidade) {
        this.topo = -1;
        this.pilha = new int [capacidade];
    }

    // 03) Método isEmpty
    public Boolean isEmpty() {
        return topo == -1;
    }

    // 04) Método isFull
    public Boolean isFull() {
        return topo == pilha.length -1;
    }

    // 05) Método push
    public void push(int info) {
        if (!isFull()){
            pilha[++topo] = info;
        }
        else {
            throw new IllegalStateException("Pilha cheia!");
        }
    }

    // 06) Método pop
    public int pop() {
        if (!isEmpty()){
            return pilha[topo--];
        }
        return -1;
    }

    // 07) Método peek
    public int peek() {
        if (!isEmpty()){
            return pilha[topo];
        }
        return -1;
    }

    // 08) Método exibe
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            for (int i = topo; i >= 0; i--) {
                System.out.println(pilha[i]);
            }
        }
    }


    //Getters & Setters (manter)
    public int getTopo() {
        return topo;
    }
}