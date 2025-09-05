package Aula3.Treino2;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    
    public String getNome(){
    return nome;
    }
    public void setNome(String nome){
    this.nome = nome;
    }
    //-------
    public String getCpf(){
    return nome;
    }
    public void setCpf(String cpf){
    this.cpf = cpf;
    }
    //------
    public int getIdade(){
    return idade;
    }
    public void setIdade(int idade){
    this.idade = idade;
    }
    public void imprimir(){
        System.out.println("Nome:"+nome);
        System.out.println("Cpf:"+cpf);
        System.out.println("Idade:"+idade);
    }
}
