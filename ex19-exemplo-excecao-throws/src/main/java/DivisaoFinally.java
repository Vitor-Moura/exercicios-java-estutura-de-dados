import javax.swing.*;

/* Essa classe é praticamente igual à classe Divisao,
   mas contém o bloco finally.
   As instruções do bloco finally são executadas sempre,
   independente de ocorrer erro ou não.
 */
public class DivisaoFinally {

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
        finally {
            JOptionPane.showMessageDialog(null,
                    "Fim de processamento");
            System.exit(0);
        }


    }
}
