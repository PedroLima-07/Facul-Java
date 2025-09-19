package Aula5.Treino2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        int opt2 = 0;
        int opt3 = 0;
        pocao poc = null;

        System.out.println("Bem-vindo ao palacio das pocoes");
        System.out.println("O que gostaria de fazer hoje?");
        do {
            System.out.println("\n=====================");
            System.out.println("1- Criar pocao");
            System.out.println("2- Ver pocao atual");
            System.out.println("3- Usar pocao");
            System.out.println("4- Descartar pocao");
            System.out.println("5- Sair");
            System.out.println("======================");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Como deseja personalizar sua pocao?");
                    System.out.println("\n============");
                    System.out.println("1- Apenas nomear");
                    System.out.println("2- Nomear e total de dano");
                    System.out.println("3- Nomear atribuir dano e tipo da pocao");
                    opt2 = sc.nextInt();
                    switch (opt2) {
                        case 1:
                            System.out.println("Qual vai ser o nome da sua pocao ?");
                            String nomePoc = sc.next();
                            poc = new pocao(nomePoc);
                            poc.setPoder(30);
                            poc.setTipo("Veneno");

                            System.out.println("Pocao criada com sucesso");
                            break;
                        case 2:
                            System.out.println("Qual vai ser o nome da sua pocao ?");
                            String nomePoc2 = sc.next();
                            System.out.println("Qual vai ser o dano da sua pocao ?");
                            int poderPoc2 = sc.nextInt();
                            poc = new pocao(nomePoc2, poderPoc2);
                            poc.setTipo("Sonifero");

                            System.out.println("Pocao criada com sucesso");
                            break;
                        case 3:
                            System.out.println("Qual vai ser o nome da sua pocao ?");
                            String nomePoc3 = sc.next();
                            System.out.println("Qual vai ser o dano da sua pocao ?");
                            int poderPoc3 = sc.nextInt();
                            System.out.println("Qual vai ser o tipo da sua pocao ?");
                            String tipoPoc3 = sc.next();
                            poc = new pocao(nomePoc3, poderPoc3, tipoPoc3);

                            System.out.println("Pocao criada com sucesso");
                            break;
                        default:
                            System.out.println("Opção inválida! Tente novamente.");
                            break;
                    }
                    break;

                case 2:
                    if (poc == null) {
                        System.out.println("Voce não possue nenhuma pocao");
                    } else {
                        poc.imprimir();
                    }

                    break;
                case 3:
                    if (poc == null) {
                        System.out.println("Voce ainda nao possue pocoes para ultilizar!!");
                    } else {
                        System.out.println("Como deseja ultilizar sua pocao?");
                        System.out.println("1- Apenas usar");
                        System.out.println("2- Usar e definir um alvo");
                        System.out.println("3- Usar, definir um alvo e quantidade de usos");
                        opt3= sc.nextInt();
                        switch (opt3) {
                            case 1:
                                poc.usar();
                                break;
                            case 2:
                                System.out.println("Qual seria o seu alvo? ");
                                String alvo = sc.next();
                                poc.usar(alvo);
                                break;
                            case 3:
                                System.out.println("Qual seria o seu alvo? ");
                                String alvo2 = sc.next();
                                System.out.println("E quantas vezes deseja ultiliza-lo");
                                int vezes = sc.nextInt();
                                poc.usar(alvo2, vezes);

                                break;
                            default:
                                System.out.println("Opção inválida! Tente novamente.");
                                break;
                        }
                    }
                    break;
                case 4:
                    poc = null;
                    System.out.println("Sua pocao foi descartada");
                    break;
                case 5:
                    System.out.println("Até breve, jovem bruxo ");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opt != 5);
        sc.close();
    }
}
