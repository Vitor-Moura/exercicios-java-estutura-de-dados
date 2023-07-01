public class App {

    public static void main(String[] args) {

        //Crianção dos objetos das classes herdeiras de Funcionário
        Engenheiro e = new Engenheiro("12345", "Fulano da Silva", 15000.0);
        Vendedor v = new Vendedor("23456", "Segundo Fulando", 30000.0, 0.10);
        Horista h = new Horista("34567", "Terceiro Fulano", 40, 100.0);

        //Criação objeto Empresa
        Empresa sptech = new Empresa();

        sptech.adicionaFunc(e);
        sptech.adicionaFunc(v);
        sptech.adicionaFunc(h);

        sptech.exibeTodos();
        sptech.exibeHorista();
        sptech.exibeTotalSalario();
        sptech.buscaFunc("12345");
        sptech.buscaFunc("3076");
    }
}
