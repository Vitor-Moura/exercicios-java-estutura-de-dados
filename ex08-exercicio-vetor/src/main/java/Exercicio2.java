import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;

        //SOLICITAR QUE O USUÁRIO DIGITE 10 INTEIROS E ARMAZENAR NO VETOR
        System.out.println("=".repeat(45));
        System.out.println("Digite 10 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do índice [" + i + "]");
            vetor[i] = leitor.nextInt();
            soma += vetor[i];
        }

        //EXIBIR A MÉDIA DOS NÚMEROS INSERIDOS NO VETOR
        System.out.println("=".repeat(45));
        System.out.println("MÉDIA");
        System.out.println(soma / 10);

        //EXIBIR OS NÚMEROS DO VETOR QUE ESTÃO ACIMA DA MÉDIA
        System.out.println("=".repeat(45));
        System.out.println("NÚMEROS ACIMA DA MÉDIA");
        for (Integer elemento : vetor) {
            if (elemento > soma / 10) {
                System.out.println(elemento);
            }
        }
    }
}
