import java.util.Scanner;

public class Aula4Exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L1, L2, L3;

        System.out.println("Vamos descobrir qual é o tipo de cada triângulo!");
        System.out.println("O equilátero possui todos os lados iguais");
        System.out.println("O isósceles possui dois lados iguais e um diferente");
        System.out.println("E por fim o escaleno tem todos os lados diferentes");

        System.out.println("Digite o lado A:");
        L1 = sc.nextDouble();
        System.out.println("Digite o lado B:");
        L2 = sc.nextDouble();
        System.out.println("Por fim digite o lado C:");
        L3 = sc.nextDouble();

        if (L1 + L2 > L3 && L2 + L3 > L1 && L3 + L1 > L2) {
        }
        if (L1 == L2 && L2 == L3 && L3 == L1) {
            System.out.println("Este triângulo é equilátero");

        } else if (L1 == L2 || L2 == L3 || L3 == L1) {
            System.out.println("Este triângulo é isósceles");

        } else {
            System.out.println("Este triângulo é escaleno");

        }
        sc.close();
    }
}
