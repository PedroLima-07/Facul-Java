//Calcular e apresentar o volume de uma lata de óleo,
//utilizando a fórmula:
//Volume = 3.14159 * r2 * altura

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos calcular o volume de uma lata de oleo!!");
        System.out.println("Me informe a altura da lata:");
        double tamanho = sc.nextDouble();
        System.out.println("Agora me informe o raio dela:");
        double raio = sc.nextDouble();
        double result = (raio * raio) * tamanho * 3.14159;
        System.out.println("O volume desta lata e de " + result);
    }
}
