import java.util.Scanner;

public class Nivel4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 5;

        int vetor[] = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        int maior =vetor [0];
        int menor = vetor[0];

        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] > maior) {
                maior = vetor[j];
            }
            if (vetor[j] < maior) {
                menor = vetor[j];
            }
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        sc.close();
    }
}
