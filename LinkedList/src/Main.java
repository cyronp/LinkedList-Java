public static void main(String[] args) {

    Vetor vetor = new Vetor(5);
    vetor.inserir(10);
    vetor.inserir(20);
    vetor.inserir(30);
    vetor.inserir(40);
    vetor.inserir(50);

    vetor.remover(20);

    vetor.exibir();
    System.out.println(vetor.buscar(30));

//    ListaEncadeada lista = new ListaEncadeada();
//
//    lista.inserirFim(10);
//    lista.inserirFim(20);
//    lista.inserirFim(30);
//    lista.inserirInicio(5);
//    lista.inserirApos(20, 25);
//
//    System.out.println("Lista após inserções:");
//    No atual = lista.inicio;
//    while (atual != null) {
//        System.out.print(atual.valor + " ");
//        atual = atual.proximo;
//    }
//    System.out.println();
//
//    System.out.println("Removendo o início...");
//    lista.removerInicio();
//    System.out.println("Removendo o fim...");
//    lista.removerFim();
//    System.out.println("Removendo o valor 20...");
//    lista.remover(20);
//
//    System.out.println("Lista após remoções:");
//    atual = lista.inicio;
//    while (atual != null) {
//        System.out.print(atual.valor + " ");
//        atual = atual.proximo;
//    }
}