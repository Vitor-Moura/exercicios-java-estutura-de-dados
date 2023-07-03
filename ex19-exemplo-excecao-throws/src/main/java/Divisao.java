import javax.swing.*;

/* Exemplo de tratamento de exceção
   Trata o erro de divisão por zero
   E o erro de quando se digita letra no lugar de número
 */

public class Divisao {

    public static void main(String[] args) {
        String snum1, snum2;

        snum1 = JOptionPane.showInputDialog("Digite um número");
        snum2 = JOptionPane.showInputDialog("Digite outro número");


        try {
//            CONVERTENDO STRING PARA INTEIRO
            int num1 = Integer.parseInt(snum1);
            int num2 = Integer.parseInt(snum2);

            JOptionPane.showMessageDialog(null,
                    num1 / num2);
        }
        catch (ArithmeticException erro) {
            JOptionPane.showMessageDialog(null,
                    "Divisão por zero!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,
                    "Digite apenas números!\n" + erro,
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        System.exit(0);

    }
}
