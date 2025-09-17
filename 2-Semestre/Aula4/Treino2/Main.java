package Aula4.Treino2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = null;
        int opcao; 

        do {
            System.out.println("\n===== MENU ANIMAL VIRTUAL =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Alimentar");
            System.out.println("3 - Brincar");
            System.out.println("4 - Dormir");
            System.out.println("5 - Mostrar Status");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do animal: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o tipo do animal: ");
                    String tipo = sc.nextLine();
                    System.out.print("Digite a idade do animal: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    animal = new Animal(nome, tipo, idade);
                    System.out.println("Animal cadastrado com sucesso!");
                    break;

                case 2:
                    if (animal != null) animal.alimentar();
                    else System.out.println("Nenhum animal cadastrado!");
                    break;

                case 3:
                    if (animal != null) animal.brincar();
                    else System.out.println("Nenhum animal cadastrado!");
                    break;

                case 4:
                    if (animal != null) animal.dormir();
                    else System.out.println("Nenhum animal cadastrado!");
                    break;

                case 5:
                    if (animal != null) animal.mostrarStatus();
                    else System.out.println("Nenhum animal cadastrado!");
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            if (animal != null && !animal.checkVivo()) {
                System.out.println("O animal morreu. Fim do programa!");
                break;
            }

        } while (opcao != 0);

        sc.close();
    }

}
