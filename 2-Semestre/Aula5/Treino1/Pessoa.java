package Aula5.Treino1;

public class Pessoa {
    private String nome;
    private int idade;
    private Livro livro;
    private int diaDevolucao;
    
    //CONSTRUTOR
    // os contrutores possuem o mesmo nome da classe e não retornam nada e nem possuem void no nome
    public Pessoa(){
        System.out.println("Objeto instanciado..........");
    }
    
    public Pessoa(String nome,int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(String nome,int idade,String livro, int diaDevolucao){
        this.nome = nome;
        this.idade = idade;
        this.livro = livro;
        this.diaDevolucao = diaDevolucao;
    }
    // METODOS
    //Este aqui ja e um metodo ele possue outro nome da classe e tambem 
    //pode ou não retornar algo porem sempre esta exposto se ele tem um void ou tipo de variavel 
    
    public void emprestar(String livro, int dias){
        this.livro = livro;
        this.diaDevolucao = dias;
    }
    public void imprimir(){
    String msg = "\n==========="
            +"\nNome: "+nome
            +"\nIdade: "+ idade
            +"\nLivro: "+livro
            +"\nDias Devolução: "+ diaDevolucao
            +"\n===========";
         System.out.println(msg);
    }
}
