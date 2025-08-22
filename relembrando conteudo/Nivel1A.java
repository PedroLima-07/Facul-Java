import java.util.Scanner;

public class Nivel1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        System.out.println("Digite um numero aleatorio: ");
        n1 = sc.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("o numero " + n1 + " e PAR");
        } else {
            System.out.println("O numero " + n1 + " é IMPAR");
        }
        sc.close();
    }
}