package Testes_Java.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<String> myChainedList = new ListaEncadeada<>();
        System.out.println("Lista encadeada está vazia? " + myChainedList.isEmpty());
        myChainedList.add("primeiro");
        myChainedList.add("segundo");
        myChainedList.add("terceiro");
        myChainedList.add("quarto");
        myChainedList.add("quinto");
        System.out.println(myChainedList);
        System.out.println("Tamanho da minha lista: " + myChainedList.size());
        System.out.println("Lista encadeada está vazia? " + myChainedList.isEmpty());
        System.out.println(myChainedList.get(0));
        System.out.println(myChainedList.get(1));
        System.out.println(myChainedList.remove(4));
        System.out.println(myChainedList);
    }
}
