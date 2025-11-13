package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class PilhaLivros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int condicao = -1;
        Stack<String> Livros = new Stack<>();


        do {
            System.out.println("\n--- Menu da Pilha de Livros ---");
            System.out.println("Digite:\n" +
                    "0 para finalizar a consulta\n" +
                    "1 para novo livro\n" +
                    "2 para retirar o último livro inserido\n" +
                    "3 ver o título do livro no topo\n" +
                    "4 verificar quantos livros empilhados\n" +
                    "5 mostra todos os livro");
            condicao = sc.nextInt();
            sc.nextLine();
            switch (condicao) {
                case 1:
                    if (Livros.size() < 10) {
                        System.out.println("Digite o nome do livro a ser adicionado: ");
                        String nomeLivro = sc.nextLine();
                        Livros.push(nomeLivro);
                        System.out.println("Livro \"" + nomeLivro + "\" adicionado com sucesso!");
                    } else {
                        System.out.println("Limite máximo atingido " + Livros.size());
                    }
                    break;
                case 2:
                    if (!Livros.empty()) {
                        String livroRemovido = Livros.pop();
                        System.out.println("Livro: " + livroRemovido + " removido com sucesso");
                    } else {
                        System.out.println("A pilha de livros está vazio");
                    }
                    break;
                case 3:
                    if (!Livros.empty()) {
                        System.out.println("O livro no topo da pilha é : " + Livros.peek());
                    } else {
                        System.out.println("A pilha de livros está vazio");
                    }
                    break;
                case 4:
                    System.out.println("Temos empilhados " + Livros.size() + " livros");
                    break;
                case 5:
                    if (!Livros.empty()) {
                        System.out.println("Todos os livros na pilha:");
                        for (int i = Livros.size() - 1; i >= 0; i--)
                            System.out.println("- " + Livros.get(i));
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
