package Aula8;

public class Aula8Ex2 {
    public static void main(String[] args) {
        int n = 1, f = 10;
        for (int t = n; t <= f; t++) {
            for (int t1 = 1; t1 <= 10; t1++) {
                int result = t * t1;
                System.out.println(t + "X" + t1 + "=" + result);
            }
        }
    }
}
