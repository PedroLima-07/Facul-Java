import java.util.Scanner;

public class Aula9Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 3;
        int b = 3;

        int[][] matrix = new int[a][b];

        int[] result = new int[a];
        double media;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Digite um numero: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nOs numeros da diagonal principal foram :");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i] == matrix[j]) {
                    System.out.println(matrix[i][j] + " ");
                    result[i] = matrix[i][j];
                }
            }
        }
        int resultado = 0;
        for (int i = 0; i < a; i++) {
            resultado = resultado + result[i];
        }
        media = resultado / a;
        System.out.println("\nA media entre esses numeros é " + media);

        sc.close();
    }
}
