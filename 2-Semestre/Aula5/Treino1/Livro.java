
package Aula5.Treino1;

public class Livro {
    private String nome;
    private String isbm;
    private String autor;
    
    public livro(){ 
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void imprimir(){
        String msg = "\n==========="
            +"\nNome: "+nome +"\nAutor:"+autor+"\nisbm:"+isbm;
         System.out.println(msg);
    }
}
