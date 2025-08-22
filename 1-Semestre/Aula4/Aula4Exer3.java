import java.util.Scanner;
public class Aula4Exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1,n2,result;
        String simbol;

        System.out.println("Digite um numero:");
        n1 = sc.nextDouble();
        System.out.println("Digite outro numero");
        n2 = sc.nextDouble();
        System.out.println("Escreva a operação que você vai utilizar(*, +, -, /):");
        simbol = sc.next();
        
        if (simbol.equals("+")) {
                result= n1+n2;
                System.out.println("O resultado é "+result);
        }else if (simbol.equals("-")) {
                result = n1-n2;
                System.out.println("o resultado é "+result);
        }else if (simbol.equals("*")) {
                result = n1*n2;
                System.out.println("O resultado é "+result);
        }else if (simbol.equals("/")) {
                if (n2!=0) {
                    result = n1/n2;
                    System.out.println("O resultado é "+ result);
            }else{
                System.out.println("Erro na divisão");
            }
        }
        sc.close();
    }
}
