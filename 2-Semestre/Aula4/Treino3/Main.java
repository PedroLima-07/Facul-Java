package Aula4.Treino3;

import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Criação do objeto sem informações
        Funcionario F1 = null;
        int opt = 0;

        System.out.println("Seja Bem-Vindo");
        System.out.println("O que deseja fazer hoje ? ");
        do {
            System.out.println("\n==========================");
            System.out.println("      MENU");
            System.out.println("1- Cadastrar funcionario");
            System.out.println("2- Mostrar Folha de pagamento");
            System.out.println("3- Sair");
            System.out.println("==========================");
            opt = sc.nextInt();

            switch (opt) {
                case 1:

                    System.out.println("Qual e o seu nome:");
                    String nome = sc.next();

                    System.out.println("Qual e o seu numero do cracha:");
                    int num1 = sc.nextInt();

                    System.out.println("Qual e o seu tipo de vinculo:\n H ou N");
                    char vinc = sc.next().toUpperCase().charAt(0);
                    //Adição a atributos nommetodo contrutor
                    F1 = new Funcionario(num1, nome, vinc);
                    
                    if (vinc == 'H') {
                        System.out.println("Qual e o seu salario por hora (R$):");
                        float sH = sc.nextFloat();
                        F1.setValorHora(sH);

                        System.out.println("Quantas horas voce trabalha por dia:");
                        float qtdHora = sc.nextFloat();
                        F1.setQtdeHora(qtdHora);
                    } else {
                        System.out.println("Qual e o seu salario bruto:");
                        float sal = sc.nextFloat();
                        F1.setSalario(sal);
                    }
                    System.out.println("E por ultimo,Quale o seu desconto mensal:");
                    float des = sc.nextFloat();
                    F1.setValorDesconto(des);

                    System.out.println("Funcionario cadastrado =)");
                    break;
                case 2:
                    if (F1 != null) {
                        System.out.println(F1.imprimir());
                    } else {
                        System.out.println("Nenhum funcionário cadastrado ainda!");
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar nosso sistema.");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opt != 3);

    }

}
