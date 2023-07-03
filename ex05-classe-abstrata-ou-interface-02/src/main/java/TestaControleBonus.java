public class TestaControleBonus {

    public static void main(String[] args) {

        Professor p1 = new Professor("Professor Um", 20, 100.0);
        Coordenador c1 = new Coordenador("Coordenador Um", 20,100.0,10, 150.0);

        ControleBonus cb = new ControleBonus();

        cb.adicionaEducador(p1);
        cb.adicionaEducador(c1);

        System.out.println("=".repeat(45));
        System.out.println("LISTA DE EDUCADORES");
        cb.exibeTodosEducadores();

        System.out.println("=".repeat(45));
        System.out.println("TOTAL DE BONUS");
        System.out.println(cb.calculaTotalBonus());
    }
}
