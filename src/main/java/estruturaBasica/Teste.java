package estruturaBasica;

public class Teste {
    public static void main(String[] args) {
        Lista nomes = new Lista(3);
        boolean ok = nomes.adiciona("Ana");
        System.out.println("Ana foi adicionada na lista? " + ok);
        ok = nomes.adiciona("Pedro");
        System.out.println("Pedro foi adicionado na lista? " + ok);
        ok = nomes.adiciona("João");
        System.out.println("João foi adicionado na lista? " + ok);
        ok = nomes.adiciona("Dani");
        System.out.println("Dani foi adicionada na lista? " + ok);

        System.out.println(nomes);

        System.out.println("O elemento na posição 2 é: " + nomes.obter(2));
        try {
            System.out.println(nomes.obter(4));
        } catch (IllegalArgumentException e) {
            System.out.println("Posição invalida!!!");
        }

        System.out.println("A posição do Pedro na lista é " + nomes.posicaoDe("Pedro"));
        System.out.println("A posção de Jonas na lista é " + nomes.posicaoDe("Jonas"));

        System.out.println("A posção de Jonas na lista é " + (nomes.posicaoDe("Jonas") == -1 ? "Não encontrado" : "Encontrado"));

        System.out.println("Removendo "+nomes.remover(2)+" da lista");
        System.out.println(nomes);
    }
}
