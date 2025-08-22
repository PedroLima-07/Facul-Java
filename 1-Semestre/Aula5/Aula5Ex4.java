package Aula5;
import java.util.Scanner;
public class Aula5Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cores;
        System.out.println("Vamos ver as caracteristicas das cores");
        System.out.println("Escreva o nome de um cor:");
        cores = sc.nextLine().toLowerCase();
        switch (cores) {
            case "vermelho":
                System.out.println(cores +" e a cor do amor e das rosas.");
                break;
            case "azul":
                System.out.println(cores+" e a cor dos oceanos e do cêu a cima de nós.");
                break;
            case "amarelo":
                System.out.println(cores+" e a cor dos girassois e do sol.");
                break;
            case "verde":
                System.out.println(cores+" e a cor da natureza.");
                break;
            case"branco":
                System.out.println(cores+" esta e a cor das nuvens do cêu.");
                break;
            case "preto":
                System.out.println(" e a cor do carvão.");
                break;
            default:
                System.out.println("Eu não fiz dessa cor fiquei com preguiça.");
                break;
        }
        sc.close();
    }
}
