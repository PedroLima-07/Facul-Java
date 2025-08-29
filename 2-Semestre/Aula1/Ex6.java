import java.util.Scanner;

public class Ex6 {
    // Sabe-se que 1 quilowatt de energia custa 1/500 avos
//do salário mínimo. Faça um algoritmo que receba o
//valor do salário mínimo e a quantidade de quilowatts
//consumida por uma residência. Calcule e mostre:
//A. O valor, em reais, de cada quilowatt;
//B. O valor, em reais, a ser pago por essa residência
//C. O valor, em reais, a ser pago com desconto de 15%

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto esta o salario minimo:");
        double salarioMinimo = sc.nextDouble();

        double valorQuilowatt = salarioMinimo / 500;

        System.out.println("O valor de 1 quilowatts e R$" + valorQuilowatt);
        System.out.println("Quantos quilowatts vc gastou esse mes?");
        int gasto = sc.nextInt();

        double contaDeLuz = gasto * valorQuilowatt;

        System.out.println("Sua conta esse mes foi de R$" + contaDeLuz);
        double contaComDesconto = (85 * contaDeLuz) / 100;
        
        System.out.println("Se voce obtivesse 15% de desconto na sua conta de luz ela sairia R$" + contaComDesconto);

    }
}