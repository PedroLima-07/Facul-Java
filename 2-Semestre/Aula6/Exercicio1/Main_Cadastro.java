package Aula6.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Cadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lstFuncionarios = new ArrayList<>();
        Funcionario pp = null;

        int opt = 0;

        System.out.println("==== CENTRAL DE ATENDIMENTO ====");
        System.out.println("O que deseja fazer hoje ?");

        do {
            System.out.println("\n======================");
            System.out.println("MENU");
            System.out.println("1- Cadastrar funcionario");
            System.out.println("2- Mostrar todos os funcionarios");
            System.out.println("3- Mostrar funcionario");
            System.out.println("4- Sair");
            opt = sc.nextInt();

            switch (opt) {
                case 1:

                    System.out.println("Codigo: ");
                    int codigo = sc.nextInt();
                    System.out.println("Nome: ");
                    String nome = sc.next();
                    System.out.println("Setor: ");
                    String setor = sc.next();
                    System.out.println("Funcao: ");
                    String funcao = sc.next();
                    System.out.println("Salario: ");
                    double salario = sc.nextDouble();

                    pp = new Funcionario(codigo, nome, setor, funcao, salario);

                    lstFuncionarios.add(pp);
                    break;
                case 2:
                    for (Funcionario n : lstFuncionarios) {
                        n.imprimir2();
                    }
                    break;
                case 3:
                    System.out.println("Qual e o codigo do funcionario que deseja encontrar ? ");
                    int cod = sc.nextInt();
                            
                    for (Funcionario p : lstFuncionarios) {
                        if (p.getCodigo() == cod) {
                            p.imprimir2();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção invalida");

            }

        } while (opt != 4);
    }

}
