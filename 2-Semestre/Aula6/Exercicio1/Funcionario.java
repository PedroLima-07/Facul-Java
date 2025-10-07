package Aula6.Exercicio1;

public class Funcionario {
    private int codigo;
    private String nome;
    private String setor;
    private String funcao;
    private double salario;
    
     //Metodo Contrutor
    public Funcionario(){
        System.out.println("Objeto instanciado");
    }
    
    public Funcionario(int codigo,String nome,String setor,String funcao, double salario){
        this();
        this.codigo=codigo;
        this.nome=nome;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
        
        
    }
    
    
//Gets and Sets
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
    //Metodo simples
    public void imprimir2(){
        String msg1 = "\n======================="
                +"\nCodigo: "+codigo
                +"\nNome: "+nome
                +"\nSetor: "+setor
                +"\nFuncao: "+funcao
                +"\nSalario: R$"+salario
                +"\n=======================";
        System.out.println(msg1);
    }
}
