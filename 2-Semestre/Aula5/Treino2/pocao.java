package Aula5.Treino2;

public class pocao {

    private String nome;
    private int poder;
    private String tipo;

    //CONTRUTORES COM SOBRECARGA-----------------
    public pocao(String nome) {
        this.nome = nome;

    }

    public pocao(String nome, int poder) {
        this.nome = nome;
        this.poder = poder;

    }

    public pocao(String nome, int poder, String tipo) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    //METODO COM SOBRECARGA----------------
    public void usar() {
        System.out.println("A pocao "+nome+" foi usada!");
        System.out.println("Ela causou "+poder+" de dano.");
    }

    public void usar(String alvo) {
        System.out.println("A pocao "+nome+" foi usada!");
        System.out.println("Ela causou "+poder+" de dano.");
    }

    public void usar(String alvo, int vezes) {
        System.out.println("A pocao "+nome+" foi usada!");
        System.out.println("Ela causou "+poder+" de dano.");
        System.out.println("E atingiu o alvo "+vezes+" vezes");
    }

    //GETS AND SETS -----------------
    //Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //poder
    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    //tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //METODO COMUM---------------------
    public void imprimir() {
        String msg = "\n================"
                + "\nPotion Status"
                + "\nNome:" + nome
                + "\nPoder:" + poder
                + "\nTipo:" + tipo
                + "\n================";
        System.out.println(msg);
    }

}
