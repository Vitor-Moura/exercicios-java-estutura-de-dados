import java.util.InputMismatchException;
import java.util.Scanner;

/* Exemplo de uso da cláusula throws
   Usado na assinatura do método para que o método lance o erro que ocorre dentro do método
   para ser tratado por quem chamou esse método
 */
public class ExemploThrows {

    /* Cláusula throws usada aqui para que o erro de divisão por zero, se ocorrer,
       não precise ser tratado dentro do método, mas deverá ser tratado pelo método
       que chamou o método divide
     */
    public static int divide (int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            System.out.println("Digite um número");
            int numerador = leitor.nextInt();
            System.out.println("Digite outro número");
            int denominador = leitor.nextInt();
            System.out.println(numerador + "/" + denominador + "=" +
                    divide(numerador, denominador));
        }
        catch (ArithmeticException erro) {      // erro de divisão por zero, lançado pelo método divide
            System.out.println("Divisão por zero!");
            erro.printStackTrace();
        }
        catch (InputMismatchException erro) {    // erro se digitar algo diferente de número
            System.out.println("Digite apenas números!");
            erro.printStackTrace();
        }
    }
}
