import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: (se for true e par se for false e impar)");
        int n = sc.nextInt();
        boolean x = parOuImpar(n);
        System.out.println(x);
    }

    public static boolean parOuImpar(int num1) {
        boolean verificacao;
        if (num1 % 2 == 0) {
            verificacao = true;
        } else {
            verificacao = false;
        }

        return verificacao;

    }
}
