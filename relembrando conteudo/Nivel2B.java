import java.util.Scanner;
public class Nivel2B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=5;
        int result=0;
        for (int i = 1; i <= n1; i++) {
            result = i+ result ;
            System.out.println(i+" "+result);
        }
        sc.close();
    }
}