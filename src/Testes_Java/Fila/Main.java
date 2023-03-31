package Testes_Java.Fila;

public class Main {
    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        System.out.println("Fila está vazia? " + minhaFila.isEmpty());
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));
        minhaFila.enqueue(new No("quinto"));
        System.out.println("Fila está vazia? " + minhaFila.isEmpty());
        System.out.println(minhaFila);

        minhaFila.dequeue();
        System.out.println(minhaFila);

        minhaFila.dequeue();
        System.out.println(minhaFila);
    }
}
