package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseyear(1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.showedTechnicalSheet();

        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println("Total de avaliações: " + myMovie.getEvaluationTotal());
        System.out.println(myMovie.mediumCatch());

        System.out.println("--------------------------------------");

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseyear(2000);
        lost.showedTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodeBySeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        System.out.println("--------------------------------------");

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setReleaseyear(2023);
        otherMovie.setDurationInMinutes(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(otherMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}
