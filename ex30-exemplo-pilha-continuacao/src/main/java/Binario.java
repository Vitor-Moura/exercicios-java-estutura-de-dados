public class Binario {

    public static void converterBinario(int numero){
        Pilha pilha = new Pilha((int) (Math.log(numero) / Math.log(2)) +1);

        int resto = numero;

        for (int i = 0; i < pilha.getTamanho(); i++){
            pilha.push(resto%2);
            resto = resto / 2;
        }
        System.out.printf("%d convertido para binário é: ", numero);
        pilha.exibeEmLinha();
    }

    public static void main(String[] args) {
        converterBinario(100);
        System.out.println();
        converterBinario(200);
    }
}
