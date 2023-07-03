import java.util.Scanner;

public class ExemploVetor {

    /* Métodos exibeVetor - recebe um vetor de inteiros
       e exibe os seus valores
     */
    public static void exibeVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("v[" + i + "]= " + v[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Criação do objeto leitor
        Scanner leitor = new Scanner(System.in);

        // Criação do 1o vetor, de inteiros, de tamanho 5
        int[] vetor = new int[5];

        // Criação do 2o vetor, de inteiros, com lista de inicializadores
        // O vetor já "nasce" com os valores que estão dentro das chaves
        // Nesse caso, não se usa a palavra new
        int[] vet2 = {100, 200, 300, 400, 500, 600, 700};

        // Criação do 3o vetor, de Strings, de tamanho 4
        String[] vet3 = new String[4];

        // Criação do 4o vetor, de Strings, com os dias da semana
        String[] diaDaSemana = {"Domingo", "Segunda", "Terça", "Quarta",
                "Quinta", "Sexta", "Sábado"};

        // Declaração do 5o vetor, de inteiros, sendo que seu tamanho
        // será digitado pelo usuário
        int[] vet5;

        // Criação das variáveis
        int numDigitado;
        int soma = 0, contaPares = 0;
        int tamanho;


        // Preencher os valores do vetor
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 10;
        }

        // Exibir o vetor
        exibeVetor(vetor);

        // Exibir vet2
        exibeVetor(vet2);

        // Solicita que o usuário digite os valores para preencher
        // o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o valor de vetor[" + i + "]");
            vetor[i] = leitor.nextInt();
        }

        // Exibir o vetor
        exibeVetor(vetor);

        // Solicita que o usuário digite os valores para preencher
        // o vet3
        for (int i = 0; i < vet3.length; i++) {
            System.out.println("Digite o valor de vet3[" + i + "]");
            vet3[i] = leitor.next();
        }

        // Exibe o vet3
        for (String nome : vet3) {
            System.out.print(nome + "\t");
        }
        System.out.println();

        // 1o Desafio
        // Criar um 4o vetor de Strings contendo os nomes dos dias da semana
        // "Domingo", "Segunda", "Terça", ...
        // Solicitar que o usuário digite um número inteiro de 1 a 7
        // Ficar num loop enquanto o número não for de 1 a 7
        // Qdo o número for válido, exibir o dia da semana correspondente,
        // usando o vetor
        // Se o número for 1, corresponde a Domingo, se for 2, é Segunda,
        // e assim por diante
        do {
            System.out.println("Digite um número de 1 a 7");
            numDigitado = leitor.nextInt();
        } while (numDigitado < 1 || numDigitado > 7);

        // OU
        //  while (! (numDigitado >= 1 && numDigitado <= 7))

        System.out.println("O dia da semana correspondente é " +
                diaDaSemana[numDigitado - 1]);

        // 2o Desafio
        // Exibir a soma dos valores do vetor (1o vetor)
        for (int num : vetor) {
            soma += num;
        }
        System.out.println("A soma dos valores de vetor é " + soma);

        // 3o Desafio
        // Exibir a quantidade de valores pares do vetor (1o vetor)
        for (int num : vetor) {
            if (num % 2 == 0) {
                contaPares++;
            }
        }
        System.out.println("A quantidade de valores pares de vetor é "
                + contaPares);

        // Solicita que o usuário digite o tamanho de vet5
        // Esse tamanho deve ser maior ou igual a 2
        // Ficar num loop enquanto não for

        System.out.println("Digite um número maior ou igual a 2");
        tamanho = leitor.nextInt();

        while (tamanho < 2) {
            System.out.println("Número inválido. Digite novamente");
            tamanho = leitor.nextInt();
        }

        // Outra forma de fazer a validação, mas sem ler o tamanho
        // antes do while
//        tamanho = 0; // seta tamanho com zero, para forçar entrar no while
//        while (tamanho < 2) {
//            System.out.println("Digite um número maior ou igual a 2");
//            tamanho = leitor.nextInt();
//        }

        // Criação de vet5 com o tamanho digitado pelo usuário
        vet5 = new int[tamanho];

        // Solicita que o usuário digite os valores para preencher
        // o vet5
        for (int i = 0; i < vet5.length; i++) {
            System.out.println("Digite o valor de vet5[" + i + "]");
            vet5[i] = leitor.nextInt();
        }

        // Exibir o vetor
        exibeVetor(vet5);

    }
}
