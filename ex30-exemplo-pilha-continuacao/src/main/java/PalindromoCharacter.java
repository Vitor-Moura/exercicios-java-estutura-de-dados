import java.text.Collator;
import java.text.Normalizer;
import java.util.regex.Pattern;

public class PalindromoCharacter {
    public static String isPalindromo(String stringDigitada) {
        stringDigitada = limparFrase(stringDigitada);

        String[] vetor = new String[stringDigitada.length()];
        PilhaObj pilhaMetade = new PilhaObj<>(stringDigitada.length()/2);

        for (int i = 0; i < stringDigitada.length(); i++) {
            vetor [i] = String.valueOf(stringDigitada.charAt(i));
        }

        int i;
        for (i = 0; i < stringDigitada.length()/2; i++) {
            pilhaMetade.push(stringDigitada.charAt(i));
        }
        if (vetor.length % 2 != 0) {
            i++;
        }

        for (; i < vetor.length; i++) {
            if (!pilhaMetade.pop().toString().equalsIgnoreCase(vetor[i])) {
                return "não é palíndromo";
            }
        }
        return "é palíndromo";

    }

    public static String limparFrase(String stringDigitada) {
        //Remove espaçoes e hífen
        stringDigitada = stringDigitada.replace(" ", "");
        stringDigitada = stringDigitada.replace("-", "");
        //Remove acentuação
        String normalizer = Normalizer.normalize(stringDigitada, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }

    public static void main(String[] args) {
        String string1 = "Ana";
        String string2 = "radar";
        String string3 = "Anotaram a data da maratona";
        String string4 = "Socorram-me subi no ônibus em Marrocos";
        String string5 = "frase nada a ver";

        System.out.printf("(%s) %s\n", string1, isPalindromo(string1));
        System.out.printf("(%s) %s\n", string2, isPalindromo(string2));
        System.out.printf("(%s) %s\n", string3, isPalindromo(string3));
        System.out.printf("(%s) %s\n", string4, isPalindromo(string4));
        System.out.printf("(%s) %s\n", string5, isPalindromo(string5));
    }
}