import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AppArquivoCsv {

    public static void gravaArquivoCsv(ListaObj<Produto> lista, String nomeArq){

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

        // bloco try catch oara gramar o arquivo
        try{
            for (int i = 0; i < lista.getTamanho(); i++) {
                Produto p = lista.getElemento(i);
                saida.format("%d;%s;%.2f;%d\n",
                        p.getId(),
                        p.getNome(),
                        p.getValorUnitario(),
                        p.getQuantidadeEstoque());
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
            System.out.printf("%-6S %-14S %10S %7S\n", "codigo", "nome", "valor", "estoque");
            while (entrada.hasNext()){
                int id = entrada.nextInt();
                String nome = entrada.next();
                Double valor = entrada.nextDouble();
                int qtdEstoque = entrada.nextInt();
                System.out.printf("%06d %-14s %10.2f %7d\n", id, nome, valor, qtdEstoque);
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
        ListaObj<Produto> lista = new ListaObj<>(10);

        lista.adiciona(new Produto(100, "Mouse sem fio", 100.0, 50 ));
        lista.adiciona(new Produto(200, "Teclado USB", 90.0, 10 ));
        lista.adiciona(new Produto(300, "Monitor", 1500.0, 20 ));
        lista.adiciona(new Produto(400, "Pendrive 16GB", 30.0, 100 ));
        lista.adiciona(new Produto(500, "HD 2TB", 500.0, 5 ));

        lista.exibe();

        gravaArquivoCsv(lista, "produto");
        leExibeArquivoCsv("produto");

    }
}
