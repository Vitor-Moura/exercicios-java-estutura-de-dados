import java.util.Scanner;
/*
Criando um novo Throw, assim podemos criar um novo tipo de exeption personalizado
 */

public class ExemploThrow {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        try {
            System.out.println("Digite a nota 1");
            Double nota1 = leitor.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                throw new LimiteUltrapassadoException("Valor inválido da nota1");
            }
            System.out.println("Digite a nota 2");
            Double nota2 = leitor.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                throw new LimiteUltrapassadoException("Valor inválido da nota2");
            }
            System.out.printf("Média = %.2f\n", (nota1 + nota2) / 2);
        }
        catch (LimiteUltrapassadoException erro){
            System.out.println(erro + " - " + erro.dataHora);
            erro.printStackTrace();
        }
    }
}
