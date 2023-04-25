package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 20);
        Aula a2 = new Aula("Listas de objetos", 16);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Depois de implementar o compareTo() e o Collections.sort(aulas)");
        Collections.sort(aulas);
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Comparando por tempo com o Comparator.compraing() e o Collections.sort(aulas)");
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Sem o Collections");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

    }
}
