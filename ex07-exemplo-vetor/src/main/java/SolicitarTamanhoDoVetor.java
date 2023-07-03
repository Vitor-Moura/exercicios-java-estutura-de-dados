import java.util.Scanner;

public class SolicitarTamanhoDoVetor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //DECLARAÇÃO DO VETOR SE INTEIROS SENDO QUESEU TAMANHO SERÁ DIGITADO PELO USUÁRIO
        int[] vetor;
        //VARIÁVEL INT PARA ARMAZENAR O TAMANHO
        int tamanho;

        // SOLICITAR QUE O USUÁRIO DIGITE O TAMAMNHO DO VETOR
        // ESSE TAMANHO DEVE SER MAIOR OU IGUAL A 2
        // FICAR NUM LOOP ENQUANTO NÃO FOR
        System.out.println("=".repeat(45));
        System.out.println("SOLICITANDO O TAMANHO DO VETOR");
        System.out.println("Digite um número maior ou igual a 2");
        tamanho = leitor.nextInt();

        while (tamanho < 2) {
            System.out.println("Número inválido, digite novamente");
            tamanho = leitor.nextInt();
        }

        //CRIAÇÃO DO VETOR COM O TAMANHO DIGITADO PELO USUÁRIO
        vetor = new int[tamanho];

        //SOLICITAR QUE O USUÁRIO DIGITE OS VALORES PARA PREENCHER O VETOR
        System.out.println("=".repeat(45));
        System.out.println("SOLICITANDO OS VALORES PARA PREENCHER O VETOR");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor do índice [" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        //EXIBIR OS ELEMENTOS DO VETOR
        System.out.println("=".repeat(45));
        System.out.println("EXIBINDO OS ELEMENTOS DO VETOR");
        for (Integer n : vetor) {
            System.out.println(n);
        }
    }
}
