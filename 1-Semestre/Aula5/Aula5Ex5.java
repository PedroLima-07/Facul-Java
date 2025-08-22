package Aula5;
import java.util.Scanner;
public class Aula5Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        String Convert;
        System.out.println("Digite valor em metros");
        n1 = sc.nextDouble();
        System.out.println("Agore escreva para qual tipo de conversão vc quer");
        System.out.println("As conversões são : M(Metros),KM(Kilometros) e CM (Centimetros)");
        Convert = sc.next().toUpperCase();
        switch (Convert) {
            case "M":
                System.out.println(n1+" Metros");
                break;
            case "KM":
                System.out.println((n1/1000)+" Kilometros");
                break;
            case "CM":
                System.out.println(n1*100+" Centimetros");
                break;
            default:
                break;
        }
        sc.close();
    }
}
