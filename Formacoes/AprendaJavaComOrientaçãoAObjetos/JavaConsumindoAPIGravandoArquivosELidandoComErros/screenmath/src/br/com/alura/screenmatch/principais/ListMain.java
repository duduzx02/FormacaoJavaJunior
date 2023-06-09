package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println(lista);
        System.out.println("Depois do Collections.sort()'");
        Collections.sort(lista);

        for(Title item : lista){
            System.out.println(item);
            if(item instanceof Movie filme && filme.getClassificacao() > 2){
                System.out.println("Classificação de "+ item.getName() + ": " + filme.getClassificacao());
            }
        }

        System.out.println("-------------------------------");

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam");
        buscaPorArtista.add("Dudu");
        buscaPorArtista.add("Charlier");
        System.out.println(buscaPorArtista);
        System.out.println("Depois do Collections.sort()'");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);




    }
}
