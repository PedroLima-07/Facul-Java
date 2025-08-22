package Aula6;
import java.util.Scanner;
public class Aula6Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos ver quais são os numero pares");
        System.out.println("Digite um numero limite :");
        int n1 = sc.nextInt();
        int result=0;
        for(int i = 1;i<=n1;i++){
            if (i%2==0) {
                result =result + i;
            }
        }
        System.out.println("A soma dos numeros pares de 1 á "+n1+" é : "+result);
        sc.close();
    }
}
