import java.util.Scanner;

public class Aula9Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 3;

        int resultA = 0;

        int[][] matrizA = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Digite um numero da matrix A:");
                matrizA[i][j] = sc.nextInt();
                if (matrizA[i][j]<=3) {
                    resultA = resultA+matrizA[i][j];
                }
            }
        }
        double media = resultA / a;
        System.out.println("A media dos numeros da primeria fileira é " + media);
        sc.close();
    }
}
