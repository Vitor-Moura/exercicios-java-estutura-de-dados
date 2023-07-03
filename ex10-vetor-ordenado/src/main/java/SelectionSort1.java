import java.util.Arrays;

public class SelectionSort1 {
    public static void selectionSort(int[] v) {
        int comparacao = 0;
        int troca = 0;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i + 1; j < v.length; j++) {
                comparacao++;
                if (v[j] < v[i]) {
                    int aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                    troca++;
                }
            }
        }
        System.out.println("\nVetor ordenado pelo SelectionSort:");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
        System.out.println("Comparações: " + comparacao);
        System.out.println("Trocas: " + troca);
    }

    public static void main(String[] args) {
        int[] vetor1 = {4, 7, 5, 2, 8, 1, 6, 3};
        selectionSort(vetor1);
    }
}


