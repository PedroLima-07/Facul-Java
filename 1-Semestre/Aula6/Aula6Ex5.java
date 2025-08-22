package Aula6;
import java.util.Scanner;
public class Aula6Ex5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um numero de inicio:");
        int inicio =sc.nextInt();
        System.out.println("Digite um numero limite :");
        int fim =sc.nextInt();
        if (inicio>fim) {
            System.out.println("O inico sempre deve ser menor que o fim");
        }else{
            for(int numero=inicio;numero<=fim;numero++){
                if (numero%7==0 ) {
                    System.out.println("O numero "+numero+" e divisivel por 7");
                    numero=fim;
                }else{
                    System.out.println("O numero "+numero+" não e divisivel por 7");
                }
            }
        }
        sc.close();
    }
}
