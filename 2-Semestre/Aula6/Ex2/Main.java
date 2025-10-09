import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        ArrayList<Faixa> faixas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== ORGANIZADOR DE MÚSICAS =====");
            System.out.println("1 - Adicionar faixa");
            System.out.println("2 - Listar faixas");
            System.out.println("3 - Reproduzir faixa");
            System.out.println("4 - Remover faixa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Duração (em segundos): ");
                    int duracao = sc.nextInt();
                    sc.nextLine();
                    faixas.add(new Faixa(titulo, artista, duracao));
                    System.out.println("Faixa adicionada com sucesso!");
                    break;

                case 2:
                    if (faixas.isEmpty()) {
                        System.out.println("Nenhuma faixa cadastrada.");
                    } else {
                        System.out.println("\n=== Lista de Faixas ===");
                        for (int i = 0; i < faixas.size(); i++) {
                            System.out.println(i + " - " + faixas.get(i).print());
                        }
                    }
                    break;

                case 3:
                    if (faixas.isEmpty()) {
                        System.out.println("Nenhuma faixa disponível para reproduzir.");
                    } else {
                        System.out.print("Digite o índice da faixa: ");
                        int indice = sc.nextInt();
                        if (indice >= 0 && indice < faixas.size()) {
                            faixas.get(indice).reproduzir();
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 4:
                    if (faixas.isEmpty()) {
                        System.out.println("Nenhuma faixa cadastrada para remover.");
                    } else {
                        System.out.print("Digite o índice da faixa a remover: ");
                        int indiceRemover = sc.nextInt();
                        if (indiceRemover >= 0 && indiceRemover < faixas.size()) {
                            System.out.println("Faixa removida: " + faixas.remove(indiceRemover).getTitulo());
                        } else {
                            System.out.println("Índice inválido!");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
