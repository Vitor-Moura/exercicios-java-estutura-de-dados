import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[]vetorDiaMes={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diaDigitado = 0;
        int mesDigitado = 0;
        int diaDoAno = 0;
        int soma = 0;

        //SOLICITAR QUE O USUÁRIO UM NÚMERO DE 1 A 31
        System.out.println("=".repeat(45));
        System.out.println("Digite um número de 1 a 31 (dia do mês)");
        diaDigitado = leitor.nextInt();
        //SOLICITAR QUE O USUÁRIO UM NÚMERO DE 1 A 12
        System.out.println("Digite um número de 1 a 12 (mês)");
        mesDigitado = leitor.nextInt();

        for (int i = 0; i < mesDigitado-1; i++) {
            soma  += vetorDiaMes[i];
        }
        diaDoAno = soma + diaDigitado;

        System.out.printf("O dia %d/%d corresponde ao dia %d do ano.", diaDigitado, mesDigitado, diaDoAno);

    }
}
