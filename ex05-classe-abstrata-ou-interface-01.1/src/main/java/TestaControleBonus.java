public class TestaControleBonus {

    public static void main(String[] args) {

        Professor p1 = new Professor("Professor Um", 20,100.0);
        Coordenador c1 = new Coordenador("Coordenador Um", 20, 100.00);

        ControleBonus cb = new ControleBonus();

        cb.adicionaBonificavel(p1);
        cb.adicionaBonificavel(c1);

        System.out.println("=".repeat(45));
        System.out.println("LISTA DE BONIFICÁVEIS");
        System.out.println(cb.listaBonificaveis);

        System.out.println("=".repeat(45));
        System.out.println("TOTAL DE BÔNUS");
        System.out.println(cb.calculaTotalBonus());;

    }
}
