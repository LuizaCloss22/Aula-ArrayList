package estruturaBasica;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        //O tipo da lista deve ser um objeto, String, Integer, Float, Double, quaçquer classe que vc tenha criado.
        ArrayList<String> lista = new ArrayList<>(3);

        //Ver se a lista tá vazia (não temos)
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            //Ver o tamanho da lista
            System.out.println("A lista contem " + lista.size() + "elementos");
        }

        //Adicionar um elemento na lista
        lista.add("A");
        lista.add("C");
        lista.add("D");
        lista.add("F");
        System.out.println(lista);

        //Adicionar em qualquer poição
        lista.add(1, "B");
        lista.add(4, "E");

        //posição de elemento
        System.out.println("o elemento 'D', está na posição " + lista.indexOf("D"));
        System.out.println("O elemento 'X', está na posição " + lista.indexOf("X"));

        //Obtendo a posição da ultima ocorrência de um elemento na lista(Esse ainda não fizemos)
        lista.add("C");
        lista.add("D");
        System.out.println("Ultima posição de 'D' é: " + lista.lastIndexOf("D"));

        //Descobrir se um elemento está na lista
        System.out.println("O elemento 'T', existe na lista? " + lista.contains("T"));
        System.out.println("O elemento 'C', existe na lista? " + lista.contains("C"));

        //pegar um elemento da lista
        System.out.println("O elemento na posição 2 é:" + lista.get(2));

        //Remover elemento especifico
        System.out.println(lista);
        System.out.println("Removendo elemento " + lista.remove(3) + " da lista pelo index");
        System.out.println("Removendo elemento A da lista pelo objeto "+lista.remove("A"));
        System.out.println(lista);

        //Ver se a lista tá vazia (não temos)
        if (lista.isEmpty()) {
            System.out.println("A lista está vazia");
        } else {
            //Ver o tamanho da lista
            System.out.println("A lista contem " + lista.size() + " elementos");
        }
        //Apagar todos os elementos da lista
        lista.clear();
        System.out.println(lista);
    }
}
