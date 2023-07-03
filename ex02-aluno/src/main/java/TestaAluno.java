public class TestaAluno {

    public static void main(String[] args) {

        AlunoFundamental f1 = new AlunoFundamental(0001, "Ffff1", 10.0,10.0,8.0,7.0);
        AlunoGraduacao g2 = new AlunoGraduacao(0002, "Gggg2", 8.0, 7.5);
        AlunoGraduacao g3 = new AlunoGraduacao(0003, "Gggg3", 5.0, 5.5);
        AlunoPos p4 = new AlunoPos(0004, "Pppp4", 8.0, 7.3, 9.0);


        System.out.println(f1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(p4);


        Escola e = new Escola("Escola de Java");

        e.adicionaAluno(f1);
        e.adicionaAluno(g2);
        e.adicionaAluno(g3);
        e.adicionaAluno(p4);

        e.exibeTodos();
        e.exibeAlunoGraduacao();
        e.exibeAprovados();
        e.buscaAluno(0003);
        e.buscaAluno(0006);


    }
}
