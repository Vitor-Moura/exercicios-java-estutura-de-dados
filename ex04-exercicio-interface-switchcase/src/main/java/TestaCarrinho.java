import java.util.Scanner;

public class TestaCarrinho {

    public static void main(String[] args) {

        Integer opcao;
        Integer livroCodigo;
        Double livroPrecoCusto;
        String livroNome;
        String livroAutor;
        String livroIsbn;
        String dvdNome;
        String dvdGravadora;
        Integer dvdCodigo;
        Double dvdPrecoCusto;
        String servicoDescricao;
        Integer servicoCodigo;
        Integer servicoQuantHoras;
        Double servicoValorHora;

        Scanner leitor = new Scanner(System.in);
        Scanner leitorNL = new Scanner(System.in);

        Boolean fim = false;

        Carrinho carrinho = new Carrinho();

        while (!fim) {
            System.out.println("\nDigite a opção desejada:\n"
                    + "1 Adicionar livro\n"
                    + "2 Adicionar DVD\n"
                    + "3 Adicionar Serviço\n"
                    + "4 Exibir itens no carrinho\n"
                    + "5 Exibir total de venda\n"
                    + "6 Fim");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o nome do livro:");
                    livroNome = leitorNL.nextLine();
                    System.out.println("\nDigite o autor do livro:");
                    livroAutor = leitorNL.nextLine();
                    System.out.println("\nDigite o ISBN do livro:");
                    livroIsbn = leitorNL.nextLine();
                    System.out.println("\nDigite o código do livro:");
                    livroCodigo = leitor.nextInt();
                    System.out.println("\nDigite o preço de custo do livro:");
                    livroPrecoCusto = leitor.nextDouble();

                    Livro livro1 = new Livro(livroCodigo, livroPrecoCusto, livroNome, livroAutor, livroIsbn);

                    carrinho.listaVendaveis.add(livro1);
                    break;

                case 2:
                    System.out.println("\nDigite o nome do DVD:");
                    dvdNome = leitorNL.nextLine();
                    System.out.println("\nDigite a gravadora do DVD:");
                    dvdGravadora = leitorNL.nextLine();
                    System.out.println("\nDigite o código do DVD:");
                    dvdCodigo = leitor.nextInt();
                    System.out.println("\nDigite o preço de custo do DVD:");
                    dvdPrecoCusto = leitor.nextDouble();

                    DVD dvd1 = new DVD(dvdCodigo, dvdPrecoCusto, dvdNome, dvdGravadora);

                    carrinho.listaVendaveis.add(dvd1);
                    break;

                case 3:
                    System.out.println("\nDigite a descrição do serviço:");
                    servicoDescricao = leitorNL.nextLine();
                    System.out.println("\nDigite o código do serviço:");
                    servicoCodigo = leitor.nextInt();
                    System.out.println("\nDigite a quantidade de horas trabalhadas:");
                    servicoQuantHoras = leitor.nextInt();
                    System.out.println("\nDigite o valor da hora trabalhada:");
                    servicoValorHora = leitor.nextDouble();

                    Servico servico1 = new Servico(servicoDescricao, servicoCodigo, servicoQuantHoras, servicoValorHora);

                    carrinho.listaVendaveis.add(servico1);
                    break;

                case 4:
                    System.out.println("=".repeat(35));
                    System.out.println("ITENS DO CARRINHO");
                    carrinho.exibeItensCarrinho();
                    break;

                case 5:
                    System.out.println("=".repeat(35));
                    System.out.println("VALOR TOTAL DA VENDA");
                    System.out.println(carrinho.calculaTotalVenda());
                    break;

                case 6:
                    fim = true;
                    break;

                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }
    }
}
