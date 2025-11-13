/*
Eu usei ArrayDeque para fazer a pilha porque ele é mais rápido e atual do que a classe
Stack. Ele permite adicionar e remover elementos no topo de forma eficiente e sem atrasos
desnecessários. Além disso, é a opção recomendada hoje em dia para implementar pilhas em Java.
 */
public class Teste {
    void main() {
        ValidarComando teste = new ValidarComando();
        System.out.println("Saída: '" + teste.analisarComandos("a#bc#d##e") + "'");   // "ae"
        System.out.println("Saída: '" + teste.analisarComandos("##xyz###") + "'");   // ""
        System.out.println("Saída: '" + teste.analisarComandos("codigo123##") + "'");   // "codigo1"
        System.out.println("Saída: '" + teste.analisarComandos("Conde#####Dracula") + "'");  // "Dracula"
    }
}



