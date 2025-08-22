import java.util.Scanner;

public class Aula3Exer1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Somar 2 numeros");

        int n1, n2, T = 0;

        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();

        System.out.println("Digite outro numero: ");
        n2 = sc.nextInt();

        T = n1 + n2;

        System.out.println("O valor da soma desses numeros será " + T);
        sc.close();
    }
}