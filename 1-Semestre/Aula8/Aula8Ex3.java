package Aula8;

import java.util.Scanner;

public class Aula8Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int consoante = 0, vogal = 0;
        System.out.println("Digite uma palavra aleatoria :");
        String p = sc.nextLine().toLowerCase();
        vogal = 0;
        consoante = 0;

        for (int f = 0; f < p.length(); f++) {
            char caractere = p.charAt(f);
            if (caractere >= 'a' && caractere <= 'z') {
                if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                    vogal++;
                } else {
                    consoante++;
                }
            }
        }
        System.out.println("A palavra " + p + " tem " + vogal + " vogais e " + consoante + " consoantes");
        sc.close();
    }
}
