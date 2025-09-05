package Aula3.Treino3;

public class Conta {

    String nome;
    String id;
    double saldo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //----------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //-----
    public double getSaldo() {
        return saldo;
    }

    public void setDeposito(double valor) {
        this.saldo += valor;
    }

    public void setSacar(double valor) {
        if (saldo < valor) {
            System.out.println("Seu saldo não bate com esse valor");
        } else {
            this.saldo -= valor;
        }
    }

}
