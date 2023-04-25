package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções do Java", "Paulo");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        aulasImutaveis.forEach(aula -> {
            System.out.println(aula);
        });

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        System.out.println("Por ordem alfabético: ");
        aulas.sort(Comparator.comparing(Aula::getTitulo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println("Tempo total de aulas: " + javaColecoes.getTempoTotal() + " minutos");
        System.out.println(javaColecoes);


    }
}
