package Aula5;
import java.util.Scanner;
public class Aula5Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,result = 0;
        String simbol, mensageOp = null;
        System.out.println("Digite um numero:");
        n1 = sc.nextDouble();
        System.out.println("Digite outro numero");
        n2 = sc.nextDouble();
        System.out.println("Escreva a operação que você vai utilizar(*, +, -, /):");
        simbol = sc.next();
        switch (simbol) {
            case "+":
                result = n1+n2;
                mensageOp = "Adição";
                break;
            case"-":
                result = n1-n2;
                mensageOp= "Subtração";
                break;
            case"*":
                result = n1*n2;
                mensageOp = "Multiplicação";
                break;
            case"/":
                result = n1/n2;
                mensageOp = "Divisão";
                break;
            default:
                System.out.println("Invalido");
                break;
        }
        System.out.println("O resultado da "+ mensageOp +" é "+result);
        sc.close();
    }
}
