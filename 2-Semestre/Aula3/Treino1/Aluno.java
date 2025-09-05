package Aula3.Treino1;

public class Aluno {

    private String ra;
    private String nome;
    private String curso;
    
    

    public String getRa() {
        return ra;
    }

    public void setRa(String Ra) {
        this.ra = Ra;
    }

    //--------------
    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    //------------
    public String getCurso() {
        return curso;
    }

    public void setCurso(String Curso) {
        this.curso = Curso;
    }

    //-------------------
    public void imprimir() {
        System.out.println("Nome:" + nome);
        System.out.println("Ra:" + ra);
        System.out.println("Curso:" + curso);
    }
}
