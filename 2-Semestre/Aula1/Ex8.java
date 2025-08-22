//Criar um algoritmo que efetue o cálculo do salário
//líquido de um professor. Os dados fornecidos serão:
//valor da hora aula, número de aulas dadas no mês e
//percentual de desconto do INSS.

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da hora aula: ");
        double valorHora = sc.nextDouble();

        System.out.println("Digite o número de aulas no mês: ");
        int numeroAulas = sc.nextInt();

        System.out.println("Digite o percentual de desconto do INSS (%): ");
        double percentualInss = sc.nextDouble();

        double salarioBruto = valorHora * numeroAulas;
        double desconto = (percentualInss * salarioBruto) / 100;
        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Salário Líquido: R$" + salarioLiquido);

    }
}
