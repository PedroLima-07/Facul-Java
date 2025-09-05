package Aula3.Treino3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha;
        String escolha2;
        double dep;
        double saq;

        System.out.println("Deseja criar uma conta? S/N");
        escolha = sc.nextLine().toUpperCase();
        if (escolha.equals("S")) {
            Conta C1 = new Conta();

            System.out.println("Certo vamos começar digite 5 numeros para ser seu ID:");
            String id = sc.nextLine();
            C1.setId(id);
            System.out.println("Agora qual e o seu nome");
            String nome = sc.nextLine();
            C1.setNome(nome);
            
            do {
                System.out.println("O que deseja fazer hoje:");
                System.out.println("1- Ver dados da conta");
                System.out.println("2- Depositar");
                System.out.println("3- Sacar");
                System.out.println("4- Sair");
                escolha2 = sc.nextLine();

                if (escolha2.equals("2")) {
                    System.out.println("Quanto deseja Depositar:");
                    dep = sc.nextDouble();
                    C1.setDeposito(dep);
                } else if (escolha2.equals("3")) {
                    System.out.println("Quanto deseja Sacar:");
                    saq = sc.nextDouble();
                    C1.setSacar(saq);
                } else if (escolha2.equals("1")) {
                    System.out.println("Nome: "+C1.getNome());
                    System.out.println("ID: "+C1.getId());
                    System.out.println("Saldo: "+C1.getSaldo());
                }

            } while (!escolha2.equals("4"));
            System.out.println("Fim do programa");

        } else {
            System.out.println("Fim do programa");
        }

    }

}
