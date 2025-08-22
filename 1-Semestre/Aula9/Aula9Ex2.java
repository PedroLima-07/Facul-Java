

import java.util.Scanner;

public class Aula9Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3;
        int b = 3;
        int[][] soma = new int[a][b];
        int result = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.println("Digite um numero:");
                soma[i][j] = sc.nextInt();
                result = result + soma[i][j];
            }
        }
        System.out.println("O resultado da soma de todos esse numero é: " + result);
        sc.close();
    }
}
