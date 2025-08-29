import java.util.Scanner;
public class Ex_4 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura atual em celsius:");
        int temp = sc.nextInt();
        double T = temperatura(temp);
        System.out.println("a sua temperatura convertida em fahrenheit e "+T);
        
    }
    public static double temperatura(int num){
        double fahrenheit = num*9/5 + 32;
        return fahrenheit;
    }
}
