public class TestaControleBonus {

    public static void main(String[] args) {

        Apresentador ap1 = new Apresentador("Apresentador Um", 10, 15000.0, 1000.0);
        Convidado cv1 = new Convidado("Convidado Um", 20, 1000.0);

        ControleBonus controleBonus = new ControleBonus();

        controleBonus.adicionaBonificavel(ap1);
        controleBonus.adicionaBonificavel(cv1);

        System.out.println("=".repeat(45));
        System.out.println("LISTA DE BONIFICÁVEIS");
        controleBonus.exiveTodosBonificaveis();

        System.out.println("=".repeat(45));
        System.out.println("TOTAL DE BÔNUS");
        System.out.println(controleBonus.calculaTotalBonus());
    }
}
