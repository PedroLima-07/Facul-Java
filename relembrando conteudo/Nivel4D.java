import java.util.Scanner;
public class Nivel4D {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int lista[] = new int[10];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            lista[i] = sc.nextInt();
        }
        for (int j = lista.length; j > 0; j--) {
            System.out.println(lista[j-1]);
        }
        sc.close();
    }
}
