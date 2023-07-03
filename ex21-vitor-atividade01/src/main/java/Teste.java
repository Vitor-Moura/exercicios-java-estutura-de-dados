import java.util.ListIterator;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Integer opcao = 0;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
        System.out.println("Bem vindo a loja do Vitor!");

        ListaObj<CameraMan> cameras = new ListaObj(5);

        do{
            System.out.println("Escolha a opção desejada: (digite 1, 2 ou 3)");
            System.out.println("1 - Adicionar um Camera Man");
            System.out.println("2 - Exibir Relatório");
            System.out.println("3 - Sair");
            opcao = leitor.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o identificador:");
                    int id = leitor.nextInt();

                    System.out.println("Digite o nome:");
                    String nome = leitorNl.nextLine();

                    System.out.println("Digite o valor do salário:");
                    Double valorSalario = leitor.nextDouble();

                    System.out.println("Digite a quantidade de horas extra:");
                    int qtdHoraExtra = leitor.nextInt();

                    System.out.println("Digite o valor da hora extra:");
                    Double valorHoraExtra = leitor.nextDouble();

                    System.out.println("Digite a quantidade programas:");
                    int qtdProgramas = leitor.nextInt();

                    cameras.adiciona(new CameraMan(id,nome,valorSalario,qtdHoraExtra, valorHoraExtra, qtdProgramas));

                    System.out.println("Camera man adicionado!");
                    break;
                case 2:
                    System.out.println("");
                    System.out.printf("%-5s %-10s %12s %18s %18s %18s \n",
                            "ID", "NOME", "SALARIO", "QTD HORA EXTRA", "VALOR HORA EXTRA", "QTD PROGRAMAS");
                    for (int i = 0; i < cameras.getTamanho(); i++){
                        CameraMan c = cameras.getElemento(i);
                        System.out.printf("%05d %-10s %12.2f %18d %18.2f %18d\n",
                                c.getId(),c.getNome(), c.getValorSalario(),c.getQtdHoraExtra(),
                                c.getValorHoraExtra(), c.getQtdProgramas());
                    }
                    System.out.printf("");
                    break;
                case 3:
                    System.out.println("Obrigada por utilizar :)");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
                    break;
            }
        } while (opcao != 3);
    }
}

