import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort (int[] v) {
        int comparacao = 0;
        int troca = 0;
        for (int i = 0; i < v.length-1; i++) {
            for (int j = 1; j < v.length-i; j++) {
                comparacao++;
                if (v[j-1] > v[j]) {    // se anterior for maior do que o atual
                    int aux = v[j];     // troca eles de lugar
                    v[j] = v[j-1];
                    v[j-1] = aux;
                    troca++;
                }
            }
        }
        System.out.println("\nVetor ordenado pelo BubbleSort:");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
        System.out.println("Comparações: " + comparacao);
        System.out.println("Trocas: " + troca);
    }

    public static void main(String[] args) {
        int[] vetor1 = {4, 7, 5, 2, 8, 1, 6, 3};
        int[] vetor2 = {1, 2, 10, 6, 5};

        bubbleSort(vetor1);
    }
}



