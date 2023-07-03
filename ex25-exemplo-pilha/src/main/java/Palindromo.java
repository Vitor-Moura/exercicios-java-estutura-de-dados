public class Palindromo {

    public static boolean isPalindromo(int[] vetor) {
        Pilha pilha2 = new Pilha(vetor.length/2);
        int i;

        for (i = 0; i < vetor.length/2; i++) {
            pilha2.push(vetor[i]);
        }

        if (vetor.length % 2 != 0) {
            i++;
        }

        for (; i < vetor.length; i++) {
            if (vetor[i] != pilha2.pop()) {
                System.out.println("Não é palíndromo");
                return false;
            }
        }
        System.out.println("É palíndromo");
        return true;
    }


    public static void main(String[] args) {
        int[] vetor = {2,4,9,4,2};
        isPalindromo(vetor);
    }
}