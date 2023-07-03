import javax.swing.*;

/* Este programa fica em loop enquanto estiver dando erro.
   Quando a divisão for ok, pára a execução
*/
public class DivisaoLoop {

    public static void main(String[] args) {
        String snum1, snum2;
        Boolean fim = false;

        while (!fim) {
            snum1 = JOptionPane.showInputDialog("Digite um número");
            snum2 = JOptionPane.showInputDialog("Digite outro número");


            try {
                int num1 = Integer.parseInt(snum1);
                int num2 = Integer.parseInt(snum2);

                JOptionPane.showMessageDialog(null,
                        num1 / num2);
                fim = true;
            } catch (ArithmeticException erro) {
                JOptionPane.showMessageDialog(null,
                        "Divisão por zero!\n" + erro,
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null,
                        "Digite apenas números!\n" + erro,
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        System.exit(0);

    }
}
