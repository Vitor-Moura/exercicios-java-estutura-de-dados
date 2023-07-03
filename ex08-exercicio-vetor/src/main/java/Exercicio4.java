import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int contador = 0;

        //SOLICITAR QUE O USUÁRIO DIGITAR 10 VALORES INTEIROS E ARMAZENAR NO VETOR
        System.out.println("=".repeat(45));
        System.out.println("Digite 10 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do índice [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        //SOLICITAR QUE O USUÁRIO DIGITE UM NÚMERO QUALQUER
        System.out.println("=".repeat(45));
        System.out.println("Digite um número qualquer");
        int numeroDigitado = leitor.nextInt();

        //EXIBIR QUANTAS VEZES ESSE NÚMERO FOI ENCONTRADO NO VETOR
        for (Integer n : vetor) {
            if (n.equals(numeroDigitado)) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println(String.format("O número %d foi encontrado %d vezes", numeroDigitado, contador));
        } else {
            System.out.println(String.format("O número %d não ocorre nenhuma vez", numeroDigitado));
        }

    }
}
