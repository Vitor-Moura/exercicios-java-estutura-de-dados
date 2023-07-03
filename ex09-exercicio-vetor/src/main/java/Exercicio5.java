import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String[] vetorModelo = new String[5];
        Integer[] vetorRendimento = new Integer[5];

        //SOLICITAR QUE O USUÁRIO DIGITE 5 MODELOS DE CARROS
        System.out.println("=".repeat(45));
        System.out.println("Digite 5 modelos de carro");
        for (int i = 0; i < vetorModelo.length; i++) {
            System.out.println("Digite um modelo no índice [" + i + "]");
            vetorModelo[i] = leitor.nextLine();

        }

        System.out.println("Digite o rendimento de cada modelo");
        for (int i = 0; i < vetorRendimento.length; i++) {
                System.out.println("Digite um rendimento no índice [" + i + "]");
                vetorRendimento[i] = leitor.nextInt();
        }

        //EXIBIR MODELO MAIS ECONÔMICO
        int maior = 0;
        int indiceMaior = -1;
        for (int i = 0; i < vetorRendimento.length; i++) {
            if(vetorRendimento[i] > maior) {
                maior = vetorRendimento[i];
                indiceMaior = i;
            }
        }
        System.out.println("=".repeat(45));
        System.out.printf("O carro com melhor rendimento é o %s.\n", vetorModelo[indiceMaior]);

    }

}
