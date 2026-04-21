public class ListaEncadeada {

    No inicio;
    No fim;

    public ListaEncadeada() {}

    public void inserirInicio(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
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
        No noInicio = inicio;

        while (noInicio != null){
            if (noInicio.valor == valorProcurado){
                No novoNo = new No(valorInserido);
                No proximoNo = noInicio.proximo;

                noInicio.proximo = novoNo;
                novoNo.anterior = noInicio;

                if (proximoNo != null) {
                    novoNo.proximo = proximoNo;
                    proximoNo.anterior = novoNo;
                } else {
                    fim = novoNo;
                }
                return;
            }
            noInicio = noInicio.proximo;
        }
    }

    public No buscar(int valor) {
        No noInicio = inicio;

        while (noInicio != null) {
            if (noInicio.valor == valor) {
                return noInicio;
            }
            noInicio = noInicio.proximo;
        }
        return null;
    }

    public void removerInicio() {
        if (inicio == null) return;

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removerFim() {
        if (fim == null){
            return;
        }
        if (inicio == fim){
            inicio = null;
            fim = null;
        } else {
            No novoFim = fim.anterior;
            novoFim.proximo = null;
            fim = novoFim;
        }
    }

    public void remover(int valor) {
        No noInicio = inicio;

        while (noInicio != null) {
            if (noInicio.valor == valor) {
                No anteriorNo = noInicio.anterior;
                No proximoNo = noInicio.proximo;

                if (anteriorNo != null) {
                    anteriorNo.proximo = proximoNo;
                } else {
                    inicio = proximoNo;
                }

                if (proximoNo != null) {
                    proximoNo.anterior = anteriorNo;
                } else {
                    fim = anteriorNo;
                }
                return;
            }
            noInicio = noInicio.proximo;
        }
    }

    public boolean estaVazia() {
        if (inicio != null) {
            return false;
        }
        return true;
    }

    public int tamanho() {
        No noInicio = inicio;
        int contador = 0;
        while (noInicio != null) {
            contador++;
            noInicio = noInicio.proximo;
        }
        return contador;
    }
}
