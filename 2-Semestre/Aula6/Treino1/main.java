package Aula6.Treino1;

import java.util.ArrayList;
public class main {

  
    public static void main(String[] args) {
        ArrayList<String> lstNomes = new ArrayList<>();
        
        
        lstNomes.add("Spider Man");
        lstNomes.add("Hulk");
        lstNomes.add("Pedro");
        
        System.out.println(lstNomes.contains("Spider Man"));
        
        
        /*for (int i = 0; i < lstNomes.size(); i++) {
            System.out.println(lstNomes.get(i));
        }*/
        
        for (String n : lstNomes) {
            System.out.println(n);
        }
          
                
    }

}
