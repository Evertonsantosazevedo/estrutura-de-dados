import java.util.ArrayDeque;
import java.util.Deque;

public class ValidarComando {

    public String analisarComandos(String comandos) {
        //cria o Deque(Pilha)
        Deque<Character> pilha = new ArrayDeque<>();

        /*tranforma comandos em um array de caracteres e armazena o elemento da vez em
        'c' que é então analisado para ver se adiciona um novo caractere ou se remove
        elemento adicionado por último
         */
        for (char c : comandos.toCharArray()) {
            if (c == '#') {
                if (!pilha.isEmpty()) {
                    pilha.removeLast();
                }
            } else {
                pilha.addLast(c); //adiciona ao topo do pilha
            }
        }

        char[] resultado = new char[pilha.size()];
        int i = 0;

        // Iteramos pela pilha e preenchemos o array
        // A iteração padrão do ArrayDeque é na ordem de inserção (FIFO)
        for (char c : pilha) {
            resultado[i] = c;
            i++;
        }
        return new String(resultado);
    }


}