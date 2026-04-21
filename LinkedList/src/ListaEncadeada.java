public class ListaEncadeada {

    No inicio;
    No fim;

    public ListaEncadeada() {}

    public void inserirInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = inicio;
        if (inicio != null) {
            inicio.anterior = novoNo;
        }
        inicio = novoNo;
    }

    public void inserirFim(int valor) {
        No novoNo = new No(valor);
        if (fim != null) {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
        } else {
            inicio = novoNo;
        }
        fim = novoNo;
    }

    public void inserirApos(int valorProcurado, int valorInserido) {

    }

    public No buscar(int valor) { return null; }

    public void removerInicio() {}

    public void removerFim() {}

    public void remover(int valor) {}

    public boolean estaVazia() { return true; }

    public int tamanho() { return 0; }
}
