import java.util.Scanner;

public class Aula4Exer2 {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos você tem: ");
        idade = sc.nextInt();

        if (idade >= 1 && idade <= 11) {
            System.out.println("Você é uma criança");
        } else {
            if (idade >= 12 && idade <= 17) {
                System.out.println("Você é um adolescente");
            }

            if (idade >= 18 && idade <= 59) {
                System.out.println("Você é um adulto");
            }

            if (idade >= 60) {
                System.out.println("Você é um idoso");
            }
        }
        sc.close();
    }
}

