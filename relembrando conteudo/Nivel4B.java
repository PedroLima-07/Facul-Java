import java.util.Scanner;
public class Nivel4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int notas[]= new int[5];
        int media = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do " + (i + 1) + "º aluno: ");
            notas[i] = sc.nextInt();
            media += notas[i];
        }
        System.out.println("A média da turma é: " + (media / notas.length));
        sc.close();
    }
}
