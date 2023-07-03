import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Teste {

    public static void gravaArquivoCsv(ListaObj<CameraMan> lista, String nomeArq){

        FileWriter arq = null; //objeto que representa o arquivo de escrita
        Formatter saida = null; //objeto usado para escrever no arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv"; //acrescenta a extensão vcs ao nome do arquivo

        //bloco try cath para abrir o arquivo
        try {
            arq = new FileWriter(nomeArq);
            saida = new Formatter(arq);
        }
        catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            erro.printStackTrace();
            System.exit(1);
        }

        // bloco try catch oara gravar o arquivo
        try{
            for (int i = 0; i < lista.getTamanho(); i++) {
                CameraMan c = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%d;%.2f;%d\n",
                        c.getId(),c.getNome(), c.getValorSalario(),c.getQtdHoraExtra(),
                        c.getValorHoraExtra(), c.getQtdProgramas());
            }
        }
        catch (FormatterClosedException erro) {
            System.out.println("Erro ao gravar o arquivo");
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            saida.close();
            try {
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo");
                erro.printStackTrace();
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }

    }

    public static void leExibeArquivoCsv (String nomeArq){
        FileReader arq = null; //objeto representa o arquivo para leitura
        Scanner entrada = null; //objeto usado para ler o arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv";

        //bloco try-cacth para abrir o arquivo
        try{
            arq = new FileReader(nomeArq);
            entrada = new Scanner(arq).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException erro){
            System.out.println("Arquivo não encontrado");
            erro.printStackTrace();
            System.exit(1);
        }

        //bloco para ler o arquivo
        try{
            System.out.printf("%-5s %-10s %12s %18s %18s %18s\n",
                    "ID", "NOME", "SALARIO", "QTD HORA EXTRA", "VALOR HORA EXTRA", "QTD PROGRAMAS");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                Double valorSalario = entrada.nextDouble();
                int qtdHoraExtra = entrada.nextInt();
                Double valorHoraExtra = entrada.nextDouble();
                int qtdProgramas = entrada.nextInt();
                System.out.printf("%05d %-10s %12.2f %18d %18.2f %18d\n",
                        id, nome, valorSalario, qtdHoraExtra,
                        valorHoraExtra, qtdProgramas);
            }
        }
        catch (NoSuchElementException erro){
            System.out.println("Arquivo com problema");
            System.out.println(erro);
            erro.printStackTrace();
            deuRuim = true;
        }
        catch (IllegalStateException erro){
            System.out.println("Erro na leitura do arquivo");
            System.out.println(erro);
            erro.printStackTrace();
            deuRuim = true;
        }
        finally {
            entrada.close();
            try {
                arq.close();
            }
            catch (IOException erro){
                System.out.println("Erro ao fechar o arquivo");
                erro.printStackTrace();
                deuRuim = true;
            }
            if (deuRuim){
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
        Integer opcao = 0;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
        System.out.println("Bem vindo a loja da Giu!");

        ListaObj<CameraMan> cameras = new ListaObj(5);

        do{
            System.out.println("\nEscolha a opção desejada: (digite 1, 2, 3, 4, 5 ou 6)");
            System.out.println("1 - Adicionar um Camera Man");
            System.out.println("2 - Atualizar quantidade de programas");
            System.out.println("3 - Exibir Relatório");
            System.out.println("4 - Gravar Arquivo");
            System.out.println("5 - Ler arquivo");
            System.out.println("6 - Sair");
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

                    System.out.println("Digite a quantidade de programas:");
                    int qtdProgramas = leitor.nextInt();

                    cameras.adiciona(new CameraMan(id,nome,valorSalario,qtdHoraExtra, valorHoraExtra, qtdProgramas));

                    System.out.println("Camera man adicionado!");
                    break;
                case 2: //-----------------------------
                    System.out.println("Digite a quantidade de programas que deseja atualizar:");
                    int antigaQtdProgramas = leitor.nextInt();
                    System.out.println("Digite uma nova quantidade de programas:");
                    int novaQtdProgramas = leitor.nextInt();
                    for (int i = 0; i < cameras.getTamanho(); i++) {
                        CameraMan c = cameras.getElemento(i);
                        if (c.getQtdProgramas().equals(antigaQtdProgramas)){
                            c.setQtdProgramas(novaQtdProgramas);
                        }
                    }
                    System.out.printf("");
                    break;
                case 3:
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
                case 4:
                    gravaArquivoCsv(cameras, "cameraMan");
                    System.out.println("Arquivo gravado com sucesso");
                    break;
                case 5:
                    System.out.println("Leitura do arquivo");
                    leExibeArquivoCsv("cameraMan");
                    break;
                case 6:
                    System.out.println("Obrigada por utilizar :)");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
                    break;
            }
        } while (opcao != 6);
    }
}

