package PecorrendoListas;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jacqueline");
        nomes.add("Paulo");
        nomes.add("Suellen");
        nomes.add("Emily");

        System.out.println("Laço foreach tradicional: ");
        for (String nome : nomes){
            System.out.println(nome);
        }

        // Mais um método de pecorrer a lista com a Expressão lmabda

        System.out.println("Expressão lambda: ");
        nomes.forEach(nome1 -> System.out.println(nome1));

        System.out.println("Method Reference: ");
        nomes.forEach(System.out::println);
    }

}
