import java.util.Scanner;

public class Nivel1C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero:");
        n1 = sc.nextInt();
        if (n1 >= 1) {
            System.out.println("Este numero e Positivo");
        } else if (n1 <= -1) {
            System.out.println("Este numero e Negativo");
        } else {
            System.out.println("Este numero é Neutro");
        }
        sc.close();
    }
}
