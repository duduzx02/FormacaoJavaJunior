package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseyear(1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Duração do filme: " + myMovie.getDurationInMinutes());

        myMovie.showedTechnicalSheet();

        myMovie.evaluate(1);
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

        var filmeEduardo = new Movie();
        filmeEduardo.setName("Dogville");
        filmeEduardo.setDurationInMinutes(200);
        filmeEduardo.setReleaseyear(2003);
        filmeEduardo.evaluate(10);
        myMovie.showedTechnicalSheet();
        System.out.println("--------------------------------------");

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(otherMovie);
        listaDeFilmes.add(filmeEduardo);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());

        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());

    }
}
