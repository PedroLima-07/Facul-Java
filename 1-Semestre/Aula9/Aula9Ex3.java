

import java.util.Scanner;

public class Aula9Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 3;
        int c = 2;
        int d = 2;

        int resultA = 0;
        int resultB = 0;

        int[][] matrizA = new int[a][b];
        int[][] matrizB = new int[c][d];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Digite um numero da matrix A:");
                matrizA[i][j] = sc.nextInt();
                resultA =resultA + matrizA[i][j];
            }
        }
        System.out.println("\n Agora vamos para a outra matrix");
        System.out.println("");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                System.out.println("Digite um numero da matriz B:");
                matrizB[i][j] = sc.nextInt();
                resultB =resultB + matrizB[i][j];
            }
        }

        System.out.println("O resultado da soma das duas matrizes é: " + (resultA + resultB));

        sc.close();
    }
}
