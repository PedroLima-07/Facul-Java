import java.util.Scanner;
public class Ex_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um operadorador:(+,-,*,%)");
        String op =sc.nextLine();
        
        System.out.println("Digite um numero:");
        int n2 =sc.nextInt();
        
        System.out.println("Digite um numero:");
        int n1 =sc.nextInt();
        
        double R = calculadora(op, n1, n2);
        System.out.println(R);

    }

    public static double calculadora(String simbol, int num1, int num2) {
        double result = 0;
        if (simbol.equals("+")) {
            result = num1 + num2;
        } else if (simbol.equals("-")) {
            result = num1 - num2;
        } else if (simbol.equals("%")) {
            result = num1 / num2;
        } else if (simbol.equals("*")) {
            result = num1 * num2;
        }

        return result;

    }

}
