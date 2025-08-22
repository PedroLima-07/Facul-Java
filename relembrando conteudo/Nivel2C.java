import java.util.Scanner;
public class Nivel2C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int n1 = sc.nextInt();
        int result;
        for (int i = 1; i <= 10; i++) {
            result= n1*i;
            System.out.println(n1+"X"+i+"="+ result);
        }
        sc.close();
    }
}
