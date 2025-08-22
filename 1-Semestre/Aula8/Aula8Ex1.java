package Aula8;

public class Aula8Ex1 {
    public static void main(String[] args) {
        int n = 3;
        int x = 3;

        for (int esteira = 0; esteira <= n; esteira++) {
            for (int produto = 0; produto <= x; produto++) {
                System.out.println("Produto" + produto + " da esteira" + esteira + " pronto");
            }
        }
    }
}
