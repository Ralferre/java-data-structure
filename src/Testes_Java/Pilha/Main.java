package Testes_Java.Pilha;

public class Main {
    public static void main(String[] args) {
        
        Pilha minhaPilhaTeste = new Pilha();

        minhaPilhaTeste.push(new No(1));
        minhaPilhaTeste.push(new No(2));
        minhaPilhaTeste.push(new No(3));
        minhaPilhaTeste.push(new No(4));
        minhaPilhaTeste.push(new No(5));
        minhaPilhaTeste.push(new No(6));
        System.out.println(minhaPilhaTeste);

        minhaPilhaTeste.pop();
        System.out.println(minhaPilhaTeste);

        minhaPilhaTeste.push(new No(38));
        System.out.println(minhaPilhaTeste);

        minhaPilhaTeste.push(new No(33));
        System.out.println(minhaPilhaTeste);

        System.out.println(minhaPilhaTeste.top());
        System.out.println(minhaPilhaTeste.isEmpty());
    }
}
