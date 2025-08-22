package Aula6;
import java.util.Scanner;
public class Aula6Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos ver o resultado de um numero fatorial");
        System.out.println("Digite um numero:");
        int n1 = sc.nextInt();
        int result=1;
        for(int i=n1;i>=1;i--){
            if (i<=n1) {
                result =result*i;
            }
        }
        System.out.println("O numero "+n1+" fatorado e igual a: "+result);
        sc.close();
    }
}
