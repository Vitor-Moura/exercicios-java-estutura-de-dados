import java.util.Arrays;

public class SelectionSort2 {

    public static void selectionSortOtimizado (int[] v) {
        int comparacao = 0;
        int troca = 0;
        int indMenor;
        for (int i = 0; i < v.length-1; i++) {
            indMenor = i;
            for (int j = i + 1; j < v.length; j++) {
                comparacao++;
                if (v[j] < v[indMenor]) {
                    indMenor = j;
                }
            }
            int aux = v[i];
            v[i] = v[indMenor];
            v[indMenor] = aux;
            troca++;
        }
        System.out.println("\nVetor ordenado pelo SelectionSortOtimizado:");
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

        selectionSortOtimizado(vetor1);
    }
}


