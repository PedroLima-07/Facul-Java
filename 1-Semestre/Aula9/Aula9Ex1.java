

import java.util.Scanner;

public class Aula9Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int m = 3;
        int[][] main = new int[n][m];

        for (int i = 0; i < 3; i++) {
            for (int J = 0; J < 3; J++) {
                System.out.println("Digite um numero");
                main[i][J] = sc.nextInt();
            }
        }
        sc.close();
    }
}
