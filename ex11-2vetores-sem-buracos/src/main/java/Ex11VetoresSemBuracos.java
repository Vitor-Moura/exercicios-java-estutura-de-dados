import java.util.Scanner;

public class Ex11VetoresSemBuracos {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String nome;
        String turma;
        Integer contadorT1 = 0;
        Integer contadorT2 = 0;
        String[] vetorT1 = new String[10];
        String[] vetorT2 = new String[10];


        for (int i = 0; i < 10; i++) {
            //SOLICITAR QUE O USUÁRIO DIGITE 1 NOME DE ALUNO E A TURMA
            System.out.println("=".repeat(45));
            System.out.println("DIGITE O NOME DO ALUNO");
            nome = leitor.nextLine();
            do {
                System.out.println("DIGITE A TURMA DESSE ALUNO (T1 ou T2)");
                turma = leitor.nextLine();
            } while (!turma.equalsIgnoreCase("T1") &&
                    !turma.equalsIgnoreCase("T2"));

            if (turma.equalsIgnoreCase("T1")){
                // O VETOR PRIMEIRO VAI LER O VALOR DO CONTADOR E DEPOIS SOMAR 1
                vetorT1[contadorT1++] = nome;

            } else if (turma.equalsIgnoreCase("T2")) {
                // O VETOR PRIMEIRO VAI LER O VALOR DO CONTADOR E DEPOIS SOMAR 1
                vetorT2[contadorT2++] = nome;
            }
        }

        System.out.println("=".repeat(45));

        if (contadorT1 == 0) {
            System.out.println("NÃO EXISTEM ALUNOS NA TURMA T1");
        } else {
            System.out.println("OS " + contadorT1 + " ALUNOS DA TURMA T1 SÃO:");
            for (int i = 0; i < contadorT1; i++) {
                System.out.print(vetorT1[i] + ";");
            }
        }

        if (contadorT2 == 0) {
            System.out.println("\nNÃO EXISTEM ALUNOS NA TURMA T2");
        } else {
            System.out.println("\nOS " + contadorT2 + " ALUNOS DA TURMA T2 SÃO:");
            for (int i = 0; i < contadorT2; i++) {
                System.out.print(vetorT2[i] + ";");
            }
        }
    }
}
