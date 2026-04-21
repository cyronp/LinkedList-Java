public static void main(String[] args) {


    // Usei IA para gerar os testes de vetor já que não continham no código original.
    Vetor v = new Vetor(3);

    // Teste de inserção simples
    v.inserir(10);
    v.inserir(20);
    v.inserir(30);

    System.out.println("Após inserções iniciais:");
    v.exibir();
    System.out.println("\nElementos: " + v.getNumElementos());
    System.out.println("Tamanho: " + v.getTamanho());

    // Teste de redimensionamento
    v.inserir(40);
    System.out.println("\nApós inserir (redimensionamento):");
    v.exibir();
    System.out.println("\nElementos: " + v.getNumElementos());
    System.out.println("Tamanho: " + v.getTamanho());

    // Teste de busca
    int pos = v.buscar(20);
    System.out.println("\nBuscar 20: posição = " + pos);

    pos = v.buscar(99);
    System.out.println("Buscar 99: posição = " + pos);

    // Teste de remoção
    System.out.println("\nRemovendo 20...");
    v.remover(20);
    v.exibir();
    System.out.println("\nElementos: " + v.getNumElementos());

    // Teste inserir em posição
    System.out.println("\nInserindo 99 na posição 1...");
    v.inserirNaPosicao(1, 99);
    v.exibir();
    System.out.println("\nElementos: " + v.getNumElementos());

    // Teste múltiplas inserções
    v.inserir(50);
    v.inserir(60);
    System.out.println("\nApós mais inserções:");
    v.exibir();
    System.out.println("\nElementos: " + v.getNumElementos());
    System.out.println("Tamanho: " + v.getTamanho());

    ListaEncadeada lista = new ListaEncadeada();

    lista.inserirFim(10);
    lista.inserirFim(20);
    lista.inserirFim(30);
    lista.inserirInicio(5);
    lista.inserirApos(20, 25);

    System.out.println("Lista após inserções:");
    No atual = lista.inicio;
    while (atual != null) {
        System.out.print(atual.valor + " ");
        atual = atual.proximo;
    }
    System.out.println();

    System.out.println("Removendo o início...");
    lista.removerInicio();
    System.out.println("Removendo o fim...");
    lista.removerFim();
    System.out.println("Removendo o valor 20...");
    lista.remover(20);

    System.out.println("Lista após remoções:");
    atual = lista.inicio;
    while (atual != null) {
        System.out.print(atual.valor + " ");
        atual = atual.proximo;
    }
    System.out.println();
    System.out.println("Funções de get da lista");
    System.out.println(lista.estaVazia());
    System.out.println(lista.tamanho());
    System.out.println(lista.buscar(25));
}