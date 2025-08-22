import java.util.Scanner;
public class Nivel3B {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Vamos ver as notas da sua média .");
        int acess = 0;
        int quant =0;
        int result= 0;
        while (acess ==0) {
            System.out.println("Digite sua nota:");
            int nota = sc.nextInt();
            result += nota;
            quant++;
            System.out.println("Você deseja continuar? Digite 0 para sim ou 1 para não.");
            acess = sc.nextInt();
        }
        System.out.println("Você digitou " + quant + " notas.");
        int media = result / quant;
        System.out.println("A média das notas é: " + media);
        sc.close();
    }
}
