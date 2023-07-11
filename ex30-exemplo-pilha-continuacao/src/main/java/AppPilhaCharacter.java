public class AppPilhaCharacter {

    public static void main(String[] args) {

        String string1 = "A pilha do gato";

        PilhaObj pilhaObj = new PilhaObj<>(string1.length());


        System.out.println("=".repeat(45));
        System.out.println("Mostrar frase");
        for (int i = 0; i < string1.length(); i++) {
            System.out.print(string1.charAt(i));
            pilhaObj.push(string1.charAt(i));
        }
        System.out.println();

        System.out.println("=".repeat(45));
        System.out.println("Mostrar frase ao contrário");
            pilhaObj.exibeEmLinha();
    }
}
