//Nome: {Gustavo da Encarnação Amaro RA: 252346
//Nome: Thiago Aires da Silva  Rodrigues Ra: 252276
//Nome: Pedro Cardoso Lima Ra: 251311}

import java.util.Scanner;

public class Ac2Final3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoTurma;
        int mediaFaculdade;

        System.out.println("Vamos começar");
        System.out.println("Me informe o tamanho da sua turma:");
        tamanhoTurma = sc.nextInt();

        while (tamanhoTurma <= 0) {

            System.out.println("por favor coloque o numero de alunos presentes na turma");
            tamanhoTurma = sc.nextInt();

        }

        System.out.println("Agora eu preciso de algumas informações sobre sua faculdade =)");
        System.out.println("Qual a média para passar de semestre (Mínimo 3):");
        mediaFaculdade = sc.nextInt();

        while (mediaFaculdade < 3 || mediaFaculdade > 10) {
            System.out.println("Média inválida, digite novamente:");
            mediaFaculdade = sc.nextInt();
        }

        System.out.println("\nAgora me informe os pesos das avaliações:");
        System.out.println("Obs: A soma dos pesos deve ser 100 (equivale a 100% da nota)");

        System.out.print("P1: ");
        double p1 = sc.nextDouble();

        System.out.print("P2: ");
        double p2 = sc.nextDouble();

        System.out.print("P3: ");
        double p3 = sc.nextDouble();

        System.out.print("P4: ");
        double p4 = sc.nextDouble();

        double somaPesos = p1 + p2 + p3 + p4;
        
        if (somaPesos != 100) {
            System.out.println("Erro: a soma dos pesos não é 100%");

            return;
        }

        double peso1 = p1 / 100;
        double peso2 = p2 / 100;
        double peso3 = p3 / 100;
        double peso4 = p4 / 100;

        String[] nomeAlunos = new String[tamanhoTurma];
        double[] mediaAlunos = new double[tamanhoTurma];
        String[] alunoStatus = new String[tamanhoTurma];

        int i = 0;

        int aprovados = 0;
        int excelencia = 0;
        int recuperacao = 0;
        int reprovados = 0;
        double somaMedias = 0;

        int key;

        System.out.println("Ok, Vamos começar");

        while (i < tamanhoTurma) {
            System.out.println("Informe o nome do estudante:");
            nomeAlunos[i] = sc.next().toUpperCase();

            System.out.println("Digite a nota da avaliação 1 do aluno " + nomeAlunos[i] + ":");
            double n1 = sc.nextDouble();
            System.out.println("Digite a nota da avaliação 2:");
            double n2 = sc.nextDouble();
            System.out.println("Digite a nota da avaliação 3:");
            double n3 = sc.nextDouble();
            System.out.println("Digite a nota da avaliação 4:");
            double n4 = sc.nextDouble();

            double media = n1 * peso1 + n2 * peso2 + n3 * peso3 + n4 * peso4;
            mediaAlunos[i] = media;
            somaMedias = somaMedias + media;

            if (media == 10) {
                alunoStatus[i] = "Aprovado com Excelência";
                aprovados++;
                excelencia++;
            } else if (media >= mediaFaculdade) {
                alunoStatus[i] = "Aprovado";
                aprovados++;
            } else if (media == mediaFaculdade - 1) {
                alunoStatus[i] = "Recuperação";
                recuperacao++;
            } else {
                alunoStatus[i] = "Reprovado";
                reprovados++;
            }

            System.out.println("Notas: " + n1 + ", " + n2 + ", " + n3 + ", " + n4);
            System.out.println("Pesos: " + p1 + "%, " + p2 + "%, " + p3 + "%, " + p4 + "%");
            System.out.println("Média: " + media);
            System.out.println("Situação: " + alunoStatus[i]);

            i++; // incrementa o número de alunos cadastrados

            if (i < tamanhoTurma) {
                do {
                    System.out.println("\nPara cadastrar mais um aluno digite 1, para sair digite 2:");
                    key = sc.nextInt();

                    if (key == 2) {
                        System.out.println("\nTurma incompleta.");
                    } else if (key != 1) {
                        System.out.println("Opção inválida, tente novamente.");
                    }

                } while (key != 1 && key != 2);

                if (key == 2) {
                    break;
                }
            }
        }

        System.out.println("\nLista dos alunos:");
        for (int j = 0; j < i; j++) {
            System.out.println((j + 1) + "º " + nomeAlunos[j] + " - Média: " + mediaAlunos[j] + " - Situação: " + alunoStatus[j]);
        }

        if (i == tamanhoTurma) {
            double mediaGeral = somaMedias / tamanhoTurma;
            
            double porcentagemAprovados = (aprovados * 100.0) / tamanhoTurma;
            double porcentagemExcelencia = (excelencia * 100.0) / tamanhoTurma;
            double porcentagemRecuperacao = (recuperacao * 100.0) / tamanhoTurma;
            double porcentagemReprovados = (reprovados * 100.0) / tamanhoTurma;

            System.out.printf("\nMédia geral da turma: %.2f\n", mediaGeral);
            System.out.printf("Aprovados: %.2f%% (com excelência: %.2f%%)\n", porcentagemAprovados, porcentagemExcelencia);
            System.out.printf("Recuperação: %.2f%%\n", porcentagemRecuperacao);
            System.out.printf("Reprovados: %.2f%%\n", porcentagemReprovados);

        }
        sc.close();
    }
}