package Aula8;

import java.util.Scanner;

public class Aula8Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = "pedro", tryName;
        String userKey = "4321", tryKey;
        int opcao, T = 0;

        do {
            System.out.println("Você deseja fazer o login ?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Você tem 3 tentativas");
                System.out.println("Usuario:");
                tryName = sc.next().toLowerCase();
                System.out.println("Senha:");
                tryKey = sc.next();
                if (tryName.equals(userName) && tryKey.equals(userKey)) {
                    System.out.println("Login bem-sucedido");
                    System.out.println("Você deseja fazer login novamente?");
                    opcao = sc.nextInt();
                } else if (!tryName.equals(userName) || tryKey != userKey) {
                    T++;
                    System.out.println("Usuario ou Senha errado, tente novamente");
                    System.out.println("usuario:");
                    tryName = sc.next();
                    System.out.println("Senha:");
                    tryKey = sc.next();
                    if (T == 3) {
                        System.out.println("Fim das tentativas");
                        break;
                    }
                }
            } else if (opcao == 2) {
                System.out.println("Opção Invalida");
            }
        } while (opcao != 2);
        System.out.println("Fim do programa");
        sc.close();
    }
}