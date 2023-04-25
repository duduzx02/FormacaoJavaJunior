package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula2 {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revistando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        aulas.forEach(aula -> {
            System.out.println(aula);
        });
        System.out.println("Ordenação por tempo de aula: ");
        aulas.sort(Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Por ordem alfabético: ");
        aulas.sort(Comparator.comparing(Aula::getTitulo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });
    }
}
