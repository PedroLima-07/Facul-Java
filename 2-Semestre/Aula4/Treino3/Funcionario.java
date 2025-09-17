package Aula4.Treino3;

public class Funcionario {

    private int cracha;
    private String nome;
    private char tipoVinculo;
    private float valorHora;
    private float qtdeHora;
    private float salario;
    private float valorDesconto;

    //Contrutor
    public Funcionario(int cracha, String nome, char tipoVinculo) {
        this.cracha = cracha;
        this.nome = nome;
        this.tipoVinculo = tipoVinculo;

    }

    //Metodos
    public float calcularSalario() {
        if (tipoVinculo == 'H') {
            return (qtdeHora * valorHora) * 20;
        } else {
            return salario;
        }
    }

    public float calcularValorReceber() {
        return calcularSalario()- valorDesconto;
    }

    public String imprimir() {
        return "Nome:" + nome + "\nCracha: " + cracha + "\nTipo Vinculo: " + tipoVinculo + "\nSalario Bruto: " + calcularSalario() + "\nDesconto: " + valorDesconto + "\nValor a receber: " +calcularValorReceber() ;

    }

    //Gets and Sets
    
    //------------------------------
    //Esses gets em sets eu achei inutil, eles so seriam usados se fosse fazer uma alteração mas isso não possui no enunciado que o senhor pediu.
    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTipoVinculo() {
        return tipoVinculo;
    }

    public void setTipoVinculo(char tipoVinculo) {
        this.tipoVinculo = tipoVinculo;
    }
    //------------------------------
    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(float qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

}
