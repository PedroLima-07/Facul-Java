import java.util.Scanner;
public class Aula4Exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Digite um numero:");
        n1 = sc.nextInt();
        if (n1>=1) {
            System.out.println(n1+" este numero e positivo");
        }else{
            if (n1==0) {
                System.out.println(n1+" este numero e zero");
            }else{
                if (n1<=-1) {
                    System.out.println(n1+ " este numero e negativo");
                }
            }
        }
        sc.close();
    }
}
