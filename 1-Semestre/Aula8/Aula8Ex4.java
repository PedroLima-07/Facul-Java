package Aula8;

import java.util.Scanner;

public class Aula8Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao, num1;

        do {
            System.out.println("Voce topa participar de um desafio?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            opcao = sc.nextInt();
            int points = 0;

            if (opcao == 1) {
                System.out.println("Eu te desafio a acertar em qual numero eu estou pensando?");
                System.out.println("eu estou pensando em um numero de 1 a 100");
                System.out.println("Qual e o seu palpite:");

                do {
                    num1 = sc.nextInt();

                    if (num1 < 71) {
                        System.out.println("Valor baixo, tente novamente");
                        points++;
                    } else if (num1 > 71) {
                        System.out.println("Valor alto, tente novamente");
                        points++;
                    } else if (num1 == 71) {
                        points++;
                        System.out.println("Parabens você acertou em " + points + " tentativas");
                    }

                } while (num1 != 71);

            } else if (opcao != 2) {
                System.out.println("Opção invalida");
            }

        } while (opcao != 2);
        System.out.println("Programa finalizado");

        sc.close();
    }
}