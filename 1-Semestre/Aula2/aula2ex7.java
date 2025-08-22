import java.util.Scanner;
public class aula2ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S, V;
        double CT,VT;
        System.out.println("Qual e o seu salario fixo :");
        S = sc.nextInt();
        System.out.println("Quantas vendas você fez esse mês :");
        V = sc.nextInt();
        CT = V * 0.04;
        VT = CT+S;
        System.out.println("O valor total das suas comissões sobre as vendas esse mês foi de "+CT);
        System.out.println("O valor total que você recebera esse mês e de "+VT);
        sc.close();
    }
}
