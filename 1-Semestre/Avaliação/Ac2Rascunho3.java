import java.util.Scanner;

public class Ac2Rascunho3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoTurma;
        int mediaFaculdade;
        int key;

        System.out.println("Vamos começar");
        System.out.println("Me informe o tamanho da sua turma");
        tamanhoTurma = sc.nextInt();

        System.out.println("Agora eu preciso de algumas informações sobre sua faculdade =)");
        System.out.println("Qual a media para passar de semestre (Minimo 3):");
        mediaFaculdade = sc.nextInt();

        while (mediaFaculdade < 3) {
            System.out.println("Media invalida, digite novamente");
            mediaFaculdade = sc.nextInt();
        }

        System.out.println("");
        System.out.println("Agora me informe os pesos das avaliações:");
        System.out.println("obs: lembre que a soma das notas deve resultar em 100");
        System.out.println("O que equivale a 100% da nota do semestre");

        System.out.println("P1:");
        double p1 = sc.nextDouble();

        System.out.println("P2:");
        double p2 = sc.nextDouble();

        System.out.println("P3:");
        double p3 = sc.nextDouble();

        System.out.println("P4:");
        double p4 = sc.nextDouble();

        double somaPesos = p1 + p2 + p3 + p4;
        if (somaPesos != 100) {
            System.out.println("A soma das pesos não resulta em 100%");
            return;
        }
        double peso1 = p1/100;
        double peso2 = p2/100;
        double peso3 = p3/100;
        double peso4 = p4/100;

        System.out.println("");
        System.out.println("Muito bem, agora vamos salvar a media dos seus estudantes");

        String[] nomeAlunos = new String[tamanhoTurma ];

        double[] mediaAlunos = new double[tamanhoTurma];

        String[] alunoStatus = new String[tamanhoTurma];

        int i = 0;

        while (i < tamanhoTurma) {
            System.out.println("Informe o nome do estudante:");
            nomeAlunos[i] = sc.next().toUpperCase();

            // Entrada das notas
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

            if (mediaAlunos[i] == 10) {
                alunoStatus[i] = "Aprovado com Excelência";
            } else if (mediaAlunos[i] >= mediaFaculdade) {
                alunoStatus[i] = "Aprovado";
            } else if (mediaAlunos[i] >= mediaFaculdade - 1) {
                alunoStatus[i] = "Recuperação";
            } else {
                alunoStatus[i] = "Reprovado";
            }

            System.out.println("O aluno " + nomeAlunos[i] + " teve a Média: " + media + " e sua Situação atual é: "
                    + alunoStatus[i]);

            do {
                System.out.println("Para cadastrar mais um aluno digite 1, para sair digite 2:");
                key = sc.nextInt();

                if (key == 2) {
                    System.out.println("Turma incompleta");

                    break;
                } 

            } while (key != 2 && key != 1);

            i++;
        }
        System.out.println("");
        System.out.println("Lista dos alunos");
        for (int in = 0; in < tamanhoTurma; in++) {
            System.out.println((in + 1) + "° " + nomeAlunos[in] + " - " + alunoStatus[in]);
        }

        sc.close();
    }
}