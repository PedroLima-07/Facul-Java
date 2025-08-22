package Aula5;
import java.util.Scanner;
public class Aula5Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia ;
        System.out.println("Que mês nos estamosa ?");
        dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Estamos em janeiro");
                break;
            case 2:
            System.out.println("Estamos em fevereiro");
                break;    
            case 3:
                System.out.println("Estamos em Março");
                break;    
            case 4:
                System.out.println("Estamos em Abril");
                break;    
            case 5:
                System.out.println("Estamos em Maio");
                break;
            case 6:
                System.out.println("Estamos em Junho");
                break;    
            case 7:
                System.out.println("Estamos em Julho");
                break;    
            case 8:
                System.out.println("Estamos em Agosto");
                break;    
            case 9:
                System.out.println("Estamos em Setembro");
                break;    
            case 10:
                System.out.println("Estamos em Outubro");
                break;    
            case 11:
                System.out.println("Estamos em Novembro");
                break;    
            case 12:
                System.out.println("Estamos em Dezembro");
                break;
        
            default:
            System.out.println("Data Invalida");
                break;
        }
        sc.close();
    }
}
