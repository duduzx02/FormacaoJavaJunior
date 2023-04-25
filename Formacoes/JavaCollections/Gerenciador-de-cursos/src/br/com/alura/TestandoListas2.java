package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas2 {
    public static void main(String[] args) {
        String curso1 = "Java 8";
        String curso2 = "Apache Camel";
        String curso3 = "Certificação Java SE 8";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        Collections.sort(cursos);
        cursos.forEach(curso -> {
            System.out.println("Curso : " + curso);
        });

        cursos.remove(0);

        System.out.println(cursos);
        System.out.println("O primeiro curso da lista é o: " + cursos.get(0));
    }
}
