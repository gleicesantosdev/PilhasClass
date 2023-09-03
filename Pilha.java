public class Pilha {
    private Object[] vetor;
    private int tamanho;
    private int topo;

    public Pilha(int tamanho) {
        this.tamanho = tamanho;
        this.vetor = new Object[tamanho];
        this.topo = -1;
    }

    public void push(Object elemento) throws PilhaCheiaException {
        if (topo >= tamanho - 1) {
            throw new PilhaCheiaException("A pilha está cheia. Não é possível inserir mais elementos.");
        }
        vetor[++topo] = elemento;
    }

    public Object pop() throws PilhaVaziaException {
        if (topo == -1) {
            throw new PilhaVaziaException("A pilha está vazia. Não é possível retirar elementos.");
        }
        return vetor[topo--];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == tamanho - 1;
    }
}