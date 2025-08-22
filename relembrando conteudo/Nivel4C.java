import java.util.Scanner;

public class Nivel4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lista[] = new int[8];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite um numero :");
            lista[i] = sc.nextInt();
        }

        System.out.println("Agora!! Escolha qual numero você gostaria de saber se está na lista:");
        int escolha = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == escolha) {
                System.out.println("O numero " + escolha + " esta na posicao " + (i + 1) + " da lista");
                encontrado = true;
                break;// Encerra o loop se o número for encontrado
            }
            if (encontrado == false) {
                System.out.println("O numero " + escolha + " nao esta na lista");
                break; // Encerra o loop se o número não for encontrado
            }
        }
        sc.close();
    }
}
