public class Aula4Exer5 {
    public static void main(String[] args) {
        int ano = 2024;
        boolean condicao1 = ano % 4 == 0;
        boolean condicao2 = ano % 100 != 0;
        boolean condicao3 = ano % 400 == 0;
        if ((condicao1 && condicao2)||condicao3) {
            System.out.println(ano+" este ano e bissexto");
        }else{
            System.out.println(ano+" este ano não e bissexto");
        }
    }
}
