package Aula7;

import java.util.Scanner;

public class Aula7Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para contarmos de ordem decrescente");
        int n1 = sc.nextInt();
        
        for (int i = n1; i >= 0; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
