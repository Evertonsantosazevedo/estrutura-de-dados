package exercicios;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class PilhaLivrosDeque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int condicao;
        Deque<String> Livros = new ArrayDeque<>();

        do {
            System.out.println("\n--- Menu da Pilha de Livros ---");
            System.out.println("""
                    Digite:
                    0 para finalizar a consulta
                    1 para adicionar novo livro
                    2 para remover livro
                    3 ver o título do livro no topo
                    4 verificar quantos livros empilhados
                    5 mostra todos os livro""");
            condicao = sc.nextInt();
            sc.nextLine();
            switch (condicao) {
                case 1:
                    System.out.println("Digite o nome do livro a ser adicionado: ");
                    String nomeLivro = sc.nextLine();
                    Livros.addFirst(nomeLivro);
                    System.out.println("Livro \"" + nomeLivro + "\" adicionado com sucesso!");
                    break;
                case 2:
                    if (Livros.isEmpty()) {
                        System.out.println("A pilha de livros está vazio");

                    } else {
                        System.out.println("Quantos livros deseja remover: ");
                        int qtd = sc.nextInt();
                        sc.nextLine();
                        if (qtd <= 0) {
                            System.out.println("A quantidade de livros deve ser maior que zero!");
                        } else if (qtd > Livros.size()) {
                            System.out.println("Só há apenas " + Livros.size() + " livros. Removendo todos os livros");
                            Livros.clear();
                        } else {
                            for (int i = 0; i < qtd; i++) {
                                String removido = Livros.removeFirst();
                                System.out.println("Removido: " + removido);
                            }

                        }
                    }
                    break;
                case 3:
                    if (!Livros.isEmpty()) {
                        System.out.println("O livro no topo da pilha é : " + Livros.peekFirst());
                    } else {
                        System.out.println("A pilha de livros está vazio");
                    }
                    break;
                case 4:
                    System.out.println("Temos empilhados " + Livros.size() + " livros");
                    break;
                case 5:
                    if (!Livros.isEmpty()) {
                        System.out.println("Todos os livros na pilha:");
                        for (String livro : Livros) {
                            System.out.println(livro);
                        }
                    } else {
                        System.out.println("A pilha de livros está vazio");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando o programa");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;

            }

        } while (condicao != 0);
        sc.close();
    }

}
