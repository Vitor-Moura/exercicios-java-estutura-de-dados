import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Teste {

    //ARQUIVO CVS
    public static void gravaArquivoCsv(ListaObj<CameraMan> lista, String nomeArq){

        FileWriter arq = null; //objeto que representa o arquivo de escrita
        Formatter saida = null; //objeto usado para escrever no arquivo
        Boolean deuRuim = false;
        nomeArq += ".csv"; //acrescenta a extensão csv ao nome do arquivo

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

        // bloco try catch para gravar o arquivo
        try{
            for (int i = 0; i < lista.getTamanho(); i++) {
                CameraMan c = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%d;%.2f;%d;%.2f;%.2f\n",
                        c.getId(),c.getNome(), c.getValorSalario(),c.getQtdHoraExtra(), c.getValorHoraExtra(),
                        c.getQtdProgramas(), c.getValorValeTransporte(), c.getValorValeRefeicao());
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
            System.out.printf("%-5S %-40S %12S %18S %18S %18S %22S %22S\n",
                    "id", "nome", "salario", "qtd hora extra", "valor hora extra", "qtd programas",
                    "valor vale transporte", "valor vale refeicao");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                Double valorSalario = entrada.nextDouble();
                int qtdHoraExtra = entrada.nextInt();
                Double valorHoraExtra = entrada.nextDouble();
                int qtdProgramas = entrada.nextInt();
                Double valorValeTransporte = entrada.nextDouble();
                Double valorValeRefeicao = entrada.nextDouble();

                System.out.printf("%05d %-40s %12.2f %18d %18.2f %18d %22.2f %22.2f\n",
                        id, nome, valorSalario, qtdHoraExtra, valorHoraExtra,
                        qtdProgramas, valorValeTransporte, valorValeRefeicao);
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

    //ARQUIVO TXT
    public static void gravaRegistro(String registro, String nomeArq){
        BufferedWriter saida = null;

        // try-cat para abrir o arquivo
        try{
            saida = new BufferedWriter(new FileWriter(nomeArq,true));
        }
        catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            erro.printStackTrace();
        }

        // try-cat para gravar e fechar o arquivo
        try{
            saida.append(registro + "\n");
            saida.close();
        }
        catch (IOException erro){
            System.out.println("Erro gravar o arquivo");
            erro.printStackTrace();
        }

    }

    public static void gravaArquivoTxt(ListaObj<CameraMan> lista, String nomeArq){
        int contaRegDados = 0;

        //Monta o registro de header
        String header = "00CAMERAMAN";
        header += LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
        header += "01";

        // Grava registro de header
        gravaRegistro(header, nomeArq);

        //Monta e grava os resistros de corpo (ou de dados)
        String corpo;
        for (int i = 0; i < lista.getTamanho(); i++) {
            CameraMan c = lista.getElemento(i);
            corpo = "02";
            corpo += String.format("%06d", c.getId());
            corpo += String.format("%-40.40s", c.getNome());
            corpo += String.format("%010.2f", c.getValorSalario());
            corpo += String.format("%02d", c.getQtdHoraExtra());
            corpo += String.format("%010.2f", c.getValorHoraExtra());
            corpo += String.format("%02d", c.getQtdProgramas());
            corpo += String.format("%010.2f", c.getValorValeTransporte());
            corpo += String.format("%010.2f", c.getValorValeRefeicao());

            gravaRegistro(corpo, nomeArq);
            contaRegDados++;
        }

        //Monta e grava o resitro de trailer
        String trailer = "01";
        trailer += String.format("%05d", contaRegDados);

        gravaRegistro(trailer, nomeArq);
    }

    public static void lerArquivoTxt(String nomeArq){
        BufferedReader entrada = null;
        String registro, tipoRegistro;
        String nome;
        Double valorSalario, valorHoraExtra, valorValeTransporte, valorValeRefeicao;
        Integer id, qtdHoraExtra, qtdProgramas;
        int contaRedDadoLido = 0;
        int qtdRegDadoGravado;

        ListaObj<CameraMan> listaLida = new ListaObj<>(5);

        // try-catch para abrir o arquivo
        try{
            entrada = new BufferedReader(new FileReader(nomeArq));
        }
        catch (IOException erro){
            System.out.println("Erro ao abrir o arquivo");
            erro.printStackTrace();
        }

        //try-catch para ler e fechar o arquivo
        try{
            //leitura do primeiro registro do arquivo
            registro = entrada.readLine();

            while (registro != null) {
                // Obtém os dois primeiros caracteres do registro

                //substring - 1o argumento = indice do inicio do que eu quero obter
                //substring - 2o arqumento = indice do final do que eu quero +1
                tipoRegistro = registro.substring(0, 2);

                if (tipoRegistro.equals("00")){
                    System.out.println("Registro de header");
                    System.out.println("Tipo de arquivo: " + registro.substring(2,11));
                    System.out.println("Data/Hora de geração do arquivo: " + registro.substring(11,30));
                    System.out.println("Versão do documento: " + registro.substring(30,32));
                }
                else if (tipoRegistro.equals("01")) {
                    System.out.println("Registro de trailer");
                    qtdRegDadoGravado = Integer.parseInt(registro.substring(2,7));
                    System.out.println("Quantidade de registros de dados lidos: " + contaRedDadoLido);
                    System.out.println("Quantidade de registros de dados gravados: " + qtdRegDadoGravado);
                    if (contaRedDadoLido == qtdRegDadoGravado){
                        System.out.println("Quantidade de registros de dados lidos compatível " +
                                "com quantidade de registro de dados gravados");
                    }
                    else {
                        System.out.println("Quantidade de registros de dados lidos incompatível " +
                                "com quantidade de registro de dados gravados");
                    }
                }
                else if (tipoRegistro.equals("02")) {
                    System.out.println("Registro de corpo");
                    id = Integer.valueOf(registro.substring(2, 8));
                    nome = registro.substring(8,48).trim();
                    valorSalario = Double.valueOf(registro.substring(48,58).replace(',', '.'));
                    qtdHoraExtra = Integer.valueOf(registro.substring(58,60));
                    valorHoraExtra = Double.valueOf(registro.substring(60,70).replace(',', '.'));
                    qtdProgramas = Integer.valueOf(registro.substring(70,72));
                    valorValeTransporte = Double.valueOf(registro.substring(72,82).replace(',', '.'));
                    valorValeRefeicao = Double.valueOf(registro.substring(82,92).replace(',', '.'));
                    contaRedDadoLido++;

                    //Instancia um objeto CameraMan com as informações lidas
                    CameraMan c = new CameraMan(id, nome, valorSalario, qtdHoraExtra, valorHoraExtra,
                            qtdProgramas, valorValeTransporte, valorValeRefeicao);

                    // Adcionando o objeto na listaLida
                    listaLida.adiciona(c);
                }
                else {
                    System.out.println("Tipo de registro inválido");
                }
                // Lê o próximo registro
                registro = entrada.readLine();
            }
            // Fecha o arquivo
            entrada.close();
        }
        catch (IOException erro){
            System.out.println("Erro ao ler o arquivo");
            erro.printStackTrace();
        }

        //Exibe a lista lida
        System.out.println("Conteúdo da lista lida do arquivo");
        for (int i = 0; i < listaLida.getTamanho(); i++) {
            CameraMan c = listaLida.getElemento(i);
            System.out.println(c);
        }
    }



    public static void main(String[] args) {
        Integer opcao = 0;
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNl = new Scanner(System.in);
        System.out.println("Bem vindo a loja da Giu!");

        ListaObj<CameraMan> cameras = new ListaObj(5);

        do{
            System.out.println("\nEscolha a opção desejada:");
            System.out.println("1 - Adicionar um Camera Man");
            System.out.println("2 - Atualizar quantidade de programas");
            System.out.println("3 - Exibir Relatório");
            System.out.println("4 - Gravar Arquivo cvs");
            System.out.println("5 - Ler arquivo cvs");
            System.out.println("6 - Gravar Arquivo txt");
            System.out.println("7 - Ler Arquivo txt");
            System.out.println("8 - Sair");
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

                    System.out.println("Digite o valor do vale transporte:");
                    Double valorValeTransporte = leitor.nextDouble();

                    System.out.println("Digite o valor do vale refeicao:");
                    Double valorValeRefeicao = leitor.nextDouble();

                    cameras.adiciona(new CameraMan(id,nome,valorSalario,qtdHoraExtra, valorHoraExtra,
                            qtdProgramas, valorValeTransporte, valorValeRefeicao));

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
                    System.out.printf("%-5S %-40S %12S %18S %18S %18S %22S %22S\n",
                            "id", "nome", "salario", "qtd hora extra", "valor hora extra", "qtd programas",
                            "valor vale transporte", "valor vale refeicao");
                    for (int i = 0; i < cameras.getTamanho(); i++){
                        CameraMan c = cameras.getElemento(i);
                        System.out.printf("%05d %-40s %12.2f %18d %18.2f %18d %22.2f %22.2f\n",
                                c.getId(),c.getNome(), c.getValorSalario(),c.getQtdHoraExtra(), c.getValorHoraExtra(),
                                c.getQtdProgramas(), c.getValorValeTransporte(), c.getValorValeRefeicao());
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
                    gravaArquivoTxt(cameras, "cameraMan.txt");
                    System.out.println("Arquivo gravado com sucesso");
                    break;
                case 7:
                    lerArquivoTxt("cameraMan.txt");
                    break;
                case 8:
                    System.out.println("Obrigada por utilizar :)");
                    break;
                default:
                    System.out.println("Opção digitada inválida");
                    break;
            }
        } while (opcao != 8);
    }
}

