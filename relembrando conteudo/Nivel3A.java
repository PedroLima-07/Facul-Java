import java.util.Scanner;

public class Nivel3A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user1 = "Pedro";
        String Pass1 = "1234";
        int acess = 1;
        while (acess == 1) {
            System.out.println("Digite o nome de usuario:");
            String user2 = sc.nextLine();
            System.out.println("Digite sua sennha:");
            String pass2 = sc.nextLine();
            if (user2.equals(user1) && pass2.equals(Pass1)) {
                System.out.println("Acesso permitido!");
                acess = 0;
            } else {
                System.out.println("Acesso negado! Tente novamente.");
            }
        }
        sc.close();
    }
}
