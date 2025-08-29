import java.util.Scanner;
public class Ex_3 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra que vc sabe quantas letras ela tem: ex(peixe = 5)");
        String let = sc.nextLine();
        
        System.out.println("Digite uma palavra que vc sabe quantas letras ela tem: ex(peixe = 5)");
        int nume = sc.nextInt();
        
        char T = letras(let,nume);
        System.out.println(T);
    }
    public static char letras(String letra,int num){
        char tamanho = letra.charAt(num);
        
        return tamanho;
        
    }
}
