import java.util.Scanner;

public class Ac2FRascunho4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanhoTurma, mediaFaculdade;

        System.out.println("Vamos começar");
        System.out.println("Me informe o tamanho da sua turma");
        tamanhoTurma = sc.nextInt();

        String[] tamanho = new String[tamanhoTurma + 1];
        
        for (int i = 0; i < tamanhoTurma; i++) {
            System.out.println("Agora digite os nomes dos alunos da sua turma:");
            tamanho[i] = sc.next().toUpperCase();
        }

        System.out.println("Agora eu preciso de algumas informações sobre sua faculdade =)");
        System.out.println("Qual a media para passar de semestre:");
        mediaFaculdade = sc.nextInt();

        while (mediaFaculdade < 3) {
            System.out.println("Media invalida, digite novamente");
            mediaFaculdade = sc.nextInt();
        }
        System.out.println("");
        System.out.println("Agora me informe os pesos das avaliações, em porcentagem:");

        System.out.println("P1:");
        double p1 = sc.nextInt();
        double peso1 = p1 / 100;

        System.out.println("P2:");
        double p2 = sc.nextInt();
        double peso2 = p2 / 100;

        System.out.println("P3:");
        double p3 = sc.nextInt();
        double peso3 = p3 / 100;

        System.out.println("P4:");
        double p4 = sc.nextInt();
        double peso4 = p4 / 100;

        System.out.println("");
        System.out.println("Muito bem, agora vamos salvar a media dos seus estudantes");

        double[] mediaAlunos = new double[tamanhoTurma];

        String[] alunoStatus = new String[tamanhoTurma];

        // ncp = nota com o peso aplicado//
        for (int i = 0; i < tamanhoTurma; i++) {

            System.out.println("");
            System.out.println("Digite a nota da avaliação1 do " + (i + 1) + "° aluno ");
            double n1 = sc.nextDouble();
            double ncp1 = n1 * peso1;

            System.out.println("Digite a avaliação2 do " + (i + 1) + "° aluno ");
            double n2 = sc.nextDouble();
            double ncp2 = n2 * peso2;

            System.out.println("Digite a nota da avaliação3 do " + (i + 1) + "° aluno ");
            double n3 = sc.nextDouble();
            double ncp3 = n3 * peso3;

            System.out.println("Digite a nota da avaliação4 do " + (i + 1) + "° aluno ");
            double n4 = sc.nextDouble();
            double ncp4 = n4 * peso4;

            double mediaTotal = (ncp1 + ncp2 + ncp3 + ncp4);
            mediaAlunos[i] = mediaTotal;

            System.out.println("As notas foram:");
            System.out.println("Nota 1 ="+n1);
            System.out.println("Nota 2 ="+n2);
            System.out.println("Nota 3 ="+n3);
            System.out.println("Nota 4 ="+n4);
            System.out.println("");

            System.out.println("Os pesos de cada nota são:");
            System.out.println("Peso 1 ="+p1);
            System.out.println("Peso 2 ="+p2);
            System.out.println("Peso 3 ="+p3);
            System.out.println("Peso 4 ="+p4);
            System.out.println("A media deste aluno é " + mediaAlunos[i]);

            if (mediaAlunos[i] == 10) {
                alunoStatus[i] = "Aprovado com excelencia";
            } else if (mediaAlunos[i] >= mediaFaculdade) {
                alunoStatus[i] = "Aprovado";
            } else if (mediaAlunos[i] == (mediaFaculdade - 1)) {
                alunoStatus[i] = "Recuperação";
            } else{
                alunoStatus[i] = "Reprovado";
            }
            System.out.println("Situação :"+alunoStatus[i]);
        }

        System.out.println("");
        System.out.println("Lista dos alunos");
        for (int i = 0; i < tamanhoTurma; i++) {
            System.out.println((i + 1) + "° " + tamanho[i] + " - " + alunoStatus[i]);
        }

        sc.close();
    }
}