import java.util.Scanner;
// Criar um vetor de Strings contendo os nomes dos dias da semana
// "Domingo", "Segunda", "Terça", ...
// Solicitar que o usuário digite um número inteiro de 1 a 7
// Ficar num loop enquanto o número digitado não for de 1 a 7
// Qdo o número for válido, exibir o dia da semana correspondente usando o vetor
// Se o número for 1, corresponde a Domingo, se for 2, é Segunda e assim por diante

public class LoopDiasDaSemana {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numDigitado;

        //VETOR COM OS FALORES JÁ DELARADOS NA CRIAÇÃO DO MESMO
        String[] diaDaSemana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};

        do {
            System.out.println("Digite um número de 1 a 7");
            numDigitado = leitor.nextInt();
        } while (numDigitado < 1 || numDigitado > 7);

        //USANDO numDigitado-1 POIS FOI PEDIDO PARA O USUÁRIO DIGITAR UM NÚMERO DE 1 A 7
        //MAS OS ÍNDICES DO VETOR VÃO DE 0 A 6
        System.out.println("O dia da semana correspondente é " + diaDaSemana[numDigitado -1]);
    }
}
