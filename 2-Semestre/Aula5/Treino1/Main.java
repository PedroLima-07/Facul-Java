package Aula5.Treino1;

public class Main {

    public static void main(String[] args) {
        
        Pessoa P = new Pessoa();
        Pessoa P2 = new Pessoa("Pedro",33);
        Pessoa P3 = new Pessoa("Joao",35,"Star Wars",20);
        
        P.imprimir();
        P2.imprimir();
        P3.imprimir();
    }
}
