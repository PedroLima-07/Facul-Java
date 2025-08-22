import java.util.Scanner;

public class Ex5 {

    // Construir um programa em java que leia o ano
    //de nascimento de João e o ano atual, calcule e
    //mostre:
    //Quantos anos João tem
    //Quantos anos João terá em 2016
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Em que ano estamos?");
        int anoAtual = sc.nextInt();
        System.out.println("Em que ano vc nasceu?");
        int nascimento = sc.nextInt();
        int ano = 2016;
        int idade = anoAtual - nascimento;
        System.out.println("João tem " + idade);
        System.out.println("João vai ter em 2016  " + (ano - nascimento));
    }
}
