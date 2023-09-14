package estruturaBasica;

public class Teste2 {
    public static void main(String[] args){
        Lista lista2 = new Lista();
        lista2.adiciona("A");
        lista2.adiciona("C");
        lista2.adiciona("D");
        lista2.adiciona("F");
        System.out.println(lista2);
        lista2.adiciona(1,"B");
        lista2.adiciona(4, "E");
        System.out.println(lista2);
    }
}
