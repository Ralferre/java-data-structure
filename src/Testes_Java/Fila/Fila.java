package Testes_Java.Fila;

public class Fila {
    private No referenciaEntradaFila;

    public Fila() {
        this.referenciaEntradaFila = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setReferenciaNo(referenciaEntradaFila);
        referenciaEntradaFila = novoNo;
    }

    public No dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;
            No noAuxiliar = referenciaEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    noAuxiliar.setReferenciaNo(null );
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                } else {
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean isEmpty() {
        return referenciaEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "=";
        No noAuxiliar = referenciaEntradaFila;
        if (referenciaEntradaFila != null) {
            while (true) {
                stringRetorno += "[No {objeto= " + noAuxiliar.getObject() + "}] ---> ";
                if (noAuxiliar.getReferenciaNo() != null) {
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = null;
        }
        return stringRetorno;
    }

}
