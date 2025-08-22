//Criar um algoritmo que leia o peso de uma
//pessoa, somente a parte inteira. Calcular e
//imprimir:
//O peso da pessoa em gramas
//O novo peso, em gramas, se a pessoa engordar 12%

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seun peso (somente a parte inteira em kg): ");
        int pesoKg = sc.nextInt();

        int pesoGramas = pesoKg * 1000;

        double novoPesoGramas = pesoGramas * 1.12;

        System.out.println("Seu peso em gramas: " + pesoGramas + " g");
        System.out.printf("O seu novo peso em gramas após engordar 12:", novoPesoGramas);
    }
}
