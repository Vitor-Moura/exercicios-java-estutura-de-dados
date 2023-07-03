import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[7];

        //SOLICITAR QUE O USUÁRIO DIGITE 7 NÚMEROS E ARMAZENAR NO VETOR
        System.out.println("=".repeat(45));
        System.out.println("Digite 7 números");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do índice [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        //EXIBIR OS NÚMEROS NA ORDEM QUE FORAM INSERIDOS
        System.out.println("=".repeat(45));
        System.out.println("ORDEM EM QUE FORAM INSERIDOS");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        //EXIBIR OS NÚMEROS NA ORDEM CONTRÁRIA
        System.out.println("=".repeat(45));
        System.out.println("ORDEM CONTRÁRIA");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
