import java.util.Scanner;
import java.util.Random;
public class Nivel3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(50)+1 ; // Gera um número aleatório entre 1 e 50
        int palpites = 0 ;

        System.out.println("Jogo de Adivinhação - Nível 3");
        System.out.println("Tente adivinhar o número secreto entre 1 e 50.");

        do {
            System.out.println("Digite seu palpite: ");
            palpites = sc.nextInt();
            System.out.println("Você digitou: " + palpites);
            if (palpites < numeroSecreto) {
                System.out.println("O número secreto é maior que " + palpites);
            } else if (palpites > numeroSecreto) {
                System.out.println("O número secreto é menor que " + palpites);
            } else {
                System.out.println("Parabéns! Você adivinhou o número secreto: " + numeroSecreto);
            }
        } while (palpites != numeroSecreto);
        System.out.println("Fim do jogo! Obrigado por jogar.");
    }
}
