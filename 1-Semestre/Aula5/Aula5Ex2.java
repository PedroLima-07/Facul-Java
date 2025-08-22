package Aula5;
import java.util.Scanner;
public class Aula5Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("Digite em numero qual e o dia da semana :");
        dia = sc.nextInt();
        if (dia>0) {
            System.out.println("Data valida");
        
        switch (dia) {
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça");
                break;
            case 4:
                System.out.println("Hoje é Quarta");
                break;
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
                break;
            case 7:
                System.out.println("Hoje é Sabado");
                break;
            default:
            System.out.println("Há apenas 7 dias na semana");
                break;
            }
        }else{
            System.out.println("Data Invalida");
        }
        sc.close();
    }
}
