import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] vetor = new String[10];

        //SOLICITAR QUE O USUÁRIO DIGITE 10 NOMES E ARMAZENAR NO VETOR
        System.out.println("=".repeat(45));
        System.out.println("Digite 10 nomes");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um nome no índice [" + i + "]");
            vetor[i] = leitor.nextLine();
        }

        //SOLICITAR QUE O USUÁRIO DIGITE UM NOME QUALQUER
        System.out.println("=".repeat(45));
        System.out.println("Digite um nome qualquer");
        String buscarNome = leitor.nextLine();

        //SE O NOME ESTIVER NO VETOR, MOSTRAR O NOME E O ÍNDICE QUE FOI ENCONTRADO
        //SE NÃO, MOSTRAR A MENSAGEM "NOME NÃO ENCONTRADO"
        Boolean existe = false;
        for (int i = 0; i < vetor.length; i++) {
            if (buscarNome.equalsIgnoreCase(vetor[i])) {
                existe = true;
                System.out.println(String.format("O nome %s foi encontrado no índice %d", buscarNome, i));
            }
        }
        if (existe == false) {
            System.out.println("Nome não encontrado");
        }
    }
}
