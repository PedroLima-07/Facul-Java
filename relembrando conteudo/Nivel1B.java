import java.util.Scanner;
public class Nivel1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Digite um numero :");
        n1 = sc.nextInt();
        System.out.println("Digite outro numero :");
        n2 = sc.nextInt();
        if (n1>n2) {
            System.out.println("O numero "+n1 +" é maior que o "+n2);
            
        }else{
            System.out.println("O numero "+n2 +" é maior que o "+n1);
        }
        sc.close();
    }
}
