package Aula4.Treino2;

import java.util.Scanner;

class Animal {
    // ===================== ATRIBUTOS =====================
    private String nome;
    private String tipo;
    private int idade;
    private int energia;
    private int felicidade;
    private boolean vivo;

    // ===================== CONSTRUTOR =====================
    public Animal(String nome, String tipo, int idade) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.energia = 100;
        this.felicidade = 100;
        this.vivo = true;
    }

    // ===================== MÉTODOS =====================
    public void alimentar() {
        if (vivo) {
            energia += 10;
            if (energia > 100) energia = 100; // Máximo é 100
            System.out.println(nome + " foi alimentado! Energia: " + energia);
        } else {
            System.out.println(nome + " está morto e não pode ser alimentado.");
        }
    }

    public void brincar() {
        if (vivo) {
            felicidade += 10;
            if (felicidade > 100) felicidade = 100; // Máximo é 100
            energia -= 5;
            System.out.println(nome + " brincou! Felicidade: " + felicidade + " | Energia: " + energia);
            if (energia <= 0) {
                vivo = false;
                System.out.println(nome + " ficou sem energia e morreu... ");
            }
        } else {
            System.out.println(nome + " está morto e não pode brincar.");
        }
    }

    public void dormir() {
        if (vivo) {
            energia = 100;
            System.out.println(nome + " dormiu e recuperou toda a energia!");
        } else {
            System.out.println(nome + " está morto e não pode dormir.");
        }
    }

    public boolean checkVivo() {
        return vivo;
    }

    public void mostrarStatus() {
        System.out.println("\n====== STATUS DO ANIMAL ======");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
        System.out.println("Felicidade: " + felicidade);
        System.out.println("Vivo: " + (vivo ? "Sim" : "Não"));
        System.out.println("==============================\n");
    }
}
