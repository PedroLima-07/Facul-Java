public class Faixa {
    private String titulo;
    private String artista;
    private int duracao;

    // Construtor
    public Faixa(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    // Métodos getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracao() {
        return duracao;
    }

    // Exibe todas as informações da faixa formatadas
    public String print() {
        return "Título: " + titulo + ", Artista: " + artista + ", Duração: " + duracao + "s";
    }

    // Simula a reprodução da faixa
    public void reproduzir() {
        System.out.println("Reproduzindo: " + titulo + " por " + artista + " (" + duracao + " segundos)");
    }
}
