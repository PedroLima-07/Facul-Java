public class Treino1 {

    public static void main(String[] args) {
      // String r = enviarEmail("faliz aniversairo","Fabio@teste","verificar ac1");
        //System.out.println(r);
        
        //enviarEmail("faliz pascoa","Pero@teste", "verificar ac2");
       
        //int X = soma(1,2);
        //System.out.println(X);
        
        char T = letras("Pedro",0);
        System.out.println(T);
        
        
    }
    public static String enviarEmail(String assunto, String remetente,String corpo){
       
        String msg = "\nAssunto"+assunto;
        msg+= "\nRemetente: "+ remetente;
        msg+= "\nCorpo: "+corpo;
        msg+= "\nAnexo: Imagem.jpg";
        return msg;
        
        //System.out.println("\nAssunto: "+assunto);
        //System.out.println("Remetente: "+ remetente);
        //System.out.println("Corpo: "+corpo);
        //System.out.println("Anexo: Imagem.jpg");
        
    }
    public static int soma(int num1, int num2){
        
        int result = num1+num2;
       //System.out.println("o resutado da conta e "+result);
       return result;
    }
    public static char letras(String letra,int num){
        char tamanho = letra.charAt(num);
        
        return tamanho;
        
    }
    
}
