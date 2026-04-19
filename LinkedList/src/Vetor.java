public class Vetor {

    private Integer[] vetor;
    private int tamanho;
    private int numElementos;

    public Vetor(int tamanho) {
        this.vetor = new Integer[tamanho];
        this.tamanho = tamanho;
        this.numElementos = 0;
    }

    // Insere no final; se cheio, dobra o tamanho do vetor
    public void inserir(int valor) {
        if (numElementos == tamanho){
            int novoTamanho = tamanho * 2;
            Integer[] novoVetor = new Integer[novoTamanho];
            for (int i = 0; i < tamanho; i++){
                novoVetor[i] = vetor[i];
            }
            vetor = novoVetor;
            tamanho = novoTamanho;
        }
        vetor[numElementos] = valor;
        numElementos++;
    }

    // Percorre item por item e retorna a posição; -1 se não encontrado
    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++){
            if (vetor[i] == valor){
                return i;
            }
        }
        return -1;
    }

    // Encontra o elemento e realoca os próximos uma posição para trás
    public boolean remover(int valor) {
        for (int i = 0; i < tamanho; i++){
            if (vetor[i] == valor){
                vetor[i] = 0;
                for (int j = 0; j < tamanho - 1; j++) {
                    if (vetor[j] == 0){
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = 0;
                    }
                }
            }
        }
        return false;
    }

    // Printa elemento por elemento do vetor
    public void exibir() {
        if (tamanho == 0){
            System.out.println("Vetor vazio!");
        } else {
            for (int i = 0; i < tamanho; i++){
                System.out.print(vetor[i] + " ");
            }
        }
    }

    // Insere na posição indicada, realocando os próximos; se cheio, dobra o tamanho
    public void inserirNaPosicao(int posicao, int valor) {}

    public int getNumElementos() { return numElementos; }

    public int getTamanho() { return tamanho; }
}
