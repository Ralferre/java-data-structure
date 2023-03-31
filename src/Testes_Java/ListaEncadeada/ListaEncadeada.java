package Testes_Java.ListaEncadeada;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        validIndex(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }
    
    public void add(T conteudo) {
        No<T>  novoNo = new No<>(conteudo);
        if (isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;
        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoLista ++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }
    
    private void validIndex(int index) {
        if (index >= size()) {
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("There is not container in this indicated position. Turn to enter a new index value, please! Last index is " + lastIndex);
        }
    }
    
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            stringRetorno += "No[conteudo=" + noAuxiliar.getConteudo() + "]" + " --> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return stringRetorno += "null";
    }
}
