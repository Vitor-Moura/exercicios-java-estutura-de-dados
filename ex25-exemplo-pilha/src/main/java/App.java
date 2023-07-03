import java.sql.SQLOutput;
import java.util.Stack;

public class App {

    public static void main(String[] args) {

        Pilha pilha01 = new Pilha(4);

        System.out.println("=".repeat(45));
        System.out.println("TESTANDO LISTA  VAZIA");
        System.out.println(pilha01.pop());

        pilha01.push(10);
        pilha01.push(30);
        pilha01.push(30);
        pilha01.push(9);


        System.out.println("=".repeat(45));
        System.out.println("ELEMTENTOS DA PILHA");
        pilha01.exibe();

        System.out.println("=".repeat(45));
        System.out.println("TOPO DA PILHA");
        System.out.println(pilha01.peek());

        System.out.println("=".repeat(45));
        System.out.println("RETIRANDO DO TOPO");
        System.out.println(pilha01.pop());
        System.out.println("PILHA ATUALIZADA");
        pilha01.exibe();

        System.out.println("=".repeat(45));
        System.out.println("TESTANDO LISTA CHEIA");
        pilha01.push(10);
        pilha01.exibe();
        pilha01.push(35);

        System.out.println("=".repeat(45));
        System.out.println("TESTANDO SE A PILHA É PALÍNDROMO");
        System.out.println(pilha01.isPalidromo(pilha01));;


    }


}
