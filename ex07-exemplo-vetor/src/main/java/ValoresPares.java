import java.util.Scanner;

public class ValoresPares {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int contadorPares = 0;

        //SOLICITAR QUE O USUÁRIO DIGITE 10 INTEIROS E ARMAZENAR NO VETOR
        System.out.println("Digite 10 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do índice [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        //EXIBIR A QUANTIDADE DE NÚMEROS PARES
        for (int num : vetor) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("A quantidade de valores pares de vetor é "
                + contadorPares);
    }
}
