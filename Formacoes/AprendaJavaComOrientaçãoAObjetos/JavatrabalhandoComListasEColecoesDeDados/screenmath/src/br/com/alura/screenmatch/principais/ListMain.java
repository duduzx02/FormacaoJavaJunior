package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {

        Movie myMovie = new Movie("O poderoso chefão", 1970);
        Movie otherMovie = new Movie("Avatar", 2023);
        var filmeEduardo = new Movie("Dogville", 20003);
        Movie matrix = new Movie("Matrix", 1999);
        Series lost = new Series("Lost", 2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(myMovie);
        myMovie.evaluate(9);
        lista.add(otherMovie);
        otherMovie.evaluate(6);
        lista.add(filmeEduardo);
        filmeEduardo.evaluate(10);
        lista.add(matrix);
        matrix.evaluate(8);
        lista.add(lost);

        for(Title item : lista){
            System.out.println(item);
            Movie filme = (Movie) item;
            System.out.println("Classificação: " + ((Movie) item).getClassificacao());
            System.out.println("Classificação: " + filme.getClassificacao());
        }
    }
}
