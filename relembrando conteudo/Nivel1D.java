import java.util.Scanner;
public class Nivel1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int j;
        int result;
        System.out.println("Vamos fazer uma operação matematica");
        System.out.println("Digite o numero equivalente a opção desejada:");
        System.out.println("1- Adição, 2- Subtração, 3- Multiplicação, 4- Divisão");
        j=sc.nextInt();
        System.out.println("OK, agr digite os numero A da operação");
        n1 = sc.nextInt();
        System.out.println("OK, agr digite os numero B da operação");
        n2 = sc.nextInt();
        if (j==1) {
            result= n1 + n2; 
            System.out.println("O resultado da adição de "+n1+"+"+n2+" é igual á "+result);
        }else if (j==2) {
            result= n1 - n2;
            System.out.println("O resultado da Subtração de "+n1+"-"+n2+" é igual á "+result);
        }else if (j==3) {
            result= n1 * n2;
            System.out.println("O resultado da Multiplicação de "+n1+"X"+n2+" é igual á "+result);
        }else if (j==4) {
            result= n1 / n2;
            System.out.println("O resultado da Divisão de "+n1+"%"+n2+" é igual á "+result);
        }
    }
}
