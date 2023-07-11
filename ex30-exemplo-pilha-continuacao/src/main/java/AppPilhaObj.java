import java.util.ArrayList;
import java.util.List;

public class AppPilhaObj {

    public static void main(String[] args) {

        String string1 = "String 1";
        String string2 = "String 2";
        String string3 = "String 3";
        String string4 = "String 4";

        PilhaObj pilhaObj = new PilhaObj<>(4);

        pilhaObj.push(string1);
        pilhaObj.push(string2);
        pilhaObj.push(string3);
        pilhaObj.push(string4);

        System.out.println("=".repeat(45));
        System.out.println("Strings empilhadas");
        pilhaObj.exibe();

        System.out.println("=".repeat(45));
        System.out.println("Desempilhando Strings");
        for (int i = 0; i < pilhaObj.getTamanho(); i++) {
            System.out.println(pilhaObj.pop());
        }
        System.out.println(pilhaObj.pop());
    }
}
