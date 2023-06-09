package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.showedTechnicalSheet();

        myMovie.evaluate(1);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println("Total de avaliações: " + myMovie.getEvaluationTotal());
        System.out.println(myMovie.mediumCatch());

        System.out.println("--------------------------------------");

        Series lost = new Series("Lost", 2000);
        lost.showedTechnicalSheet();
        lost.setSeasons(10);
        lost.setEpisodeBySeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDurationInMinutes());

        System.out.println("--------------------------------------");

        Movie otherMovie = new Movie("Avatar", 2023);
        otherMovie.setDurationInMinutes(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(myMovie);
        calculadora.inclui(otherMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("--------------------------------------");

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(myMovie);

        System.out.println("--------------------------------------");

        Episodio episodio = new Episodio();
        episodio.setNome("Piloto");
        episodio.setNumero(1);
        episodio.setTotalVizualizacoes(300);
        episodio.setSerie(lost);
        filtroRecomendacao.filtra(episodio);

        var filmeEduardo = new Movie("Dogville", 20003);
        filmeEduardo.setDurationInMinutes(200);
        filmeEduardo.evaluate(10);
        myMovie.showedTechnicalSheet();
        System.out.println("--------------------------------------");

        Movie matrix = new Movie("Matrix", 1999);

        List<Movie> listaDeFilmes = new LinkedList<>();
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(otherMovie);
        listaDeFilmes.add(filmeEduardo);
        listaDeFilmes.add(matrix);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());

        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());

    }
}
