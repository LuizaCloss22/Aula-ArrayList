package estruturaBasica;

public class Lista {
    private String[] elementos;
    private int tamanho;

    public Lista() {
        elementos = new String[10];
        tamanho = 0;
    }

    public Lista(int capacidadeInicial) {
        elementos = new String[capacidadeInicial];
        tamanho = 0;
    }

    public boolean adiciona(String elemento) {
        aumentaCapacidade();
        if (tamanho < elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, String elemento) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("posição invalida");
        }
        aumentaCapacidade();
        for (int i = tamanho - 1; i >= posicao; i--) {
            elementos[i + 1] = elementos[i];
        }
        /*
        for (int i = posicao; i <= tamanho - 1; i++) {
            elementos[i + 1] = elementos[i];
        }
        */
        elementos[posicao] = elemento;
        tamanho++;
        return true;
    }

    public String obter(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição invalida!!");
        }
        return elementos[posicao];
    }

    public int posicaoDe(String elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    private void aumentaCapacidade() {
        if (elementos.length == tamanho) {
            String[] aux = new String[tamanho * 2];

            for (int i = 0; i < tamanho; i++) {
                aux[i] = elementos[i];
            }
            //System.arraycopy(elementos, 0, aux, 0, tamanho);
            elementos = aux;
        }
    }

    public String remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição invalida!!");
        }
        String elemento = elementos[posicao];
        for (int i = posicao; i <= tamanho - 1; i++) {
            elementos[i] = elementos[i + 1];
        }
        tamanho--;
        return elemento;
    }

    @Override
    public String toString() {
        String retorno = "[";
        if (tamanho > 0) {
            for (int i = 0; i < tamanho - 1; i++) {
                retorno += elementos[i] + ", ";
            }
            retorno += elementos[tamanho - 1];
        }
        retorno += "]";
        return retorno;
    }
}
