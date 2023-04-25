package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        for (String aula:
             aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println(primeiraAula);

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aulas : " + 0+(i+1) + aulas.get(i));
        }

        System.out.println("Tamanho da ArrayList: " + aulas.size());

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });

        aulas.add("Aula sobre Astronomia");
        Collections.sort(aulas);

        aulas.forEach(aula -> {
            System.out.println("Pecorrendo: ");
            System.out.println("Aula: " + aula);
        });
    }
}
