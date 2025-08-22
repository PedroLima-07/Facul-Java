package Aula6;
import java.util.Scanner;
public class Aula6Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos fazer a tabuada");
        System.out.println("Digite um numero para calcularmos a tabuada:");
        int n1 = sc.nextInt();
        System.out.println("Agora digite ate que numero se deve fazer o calculo:");
        int f1 =sc.nextInt();
        int result;
        for(int i = 1; i<=f1 ; i++){
                result = n1*i;
                System.out.println(n1+"X"+i+"="+result);
        }
        sc.close();
    }
}
