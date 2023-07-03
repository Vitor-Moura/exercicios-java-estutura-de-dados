public class TestaTributo {

    public static void main(String[] args) {
        Alimento a1 = new Alimento(0001, "Tapioca", 10.0, 3);
        Perfume p1 = new Perfume(0002, "Fediroso", 100.0, "Rosas estragadas");
        Serviço s1 = new Serviço("Trabalho Duro",1000.0);

        Tributo t1 = new Tributo();

        t1.adicionaTributavel(a1);
        t1.adicionaTributavel(p1);
        t1.adicionaTributavel(s1);

        t1.exibeTodos();

        System.out.printf("Total de tributos: R$ %.2f\n",
                            t1.calculaTotalTributo());
    }
}
