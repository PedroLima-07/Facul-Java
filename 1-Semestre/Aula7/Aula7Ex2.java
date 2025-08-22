package Aula7;

public class Aula7Ex2 {
    public static void main(String[] args) {
        int N =6;
        int proximo=1;
        int primeiro=1;
        int segundo=0;

        System.out.println("Elemento "+1+": "+proximo);
        for(int i = 1 ; i< N; i++){
            proximo= primeiro + segundo;
            segundo = primeiro;
            primeiro = proximo;
            System.out.println("Elemento "+(i+1)+": "+proximo);
        }
    }
}
