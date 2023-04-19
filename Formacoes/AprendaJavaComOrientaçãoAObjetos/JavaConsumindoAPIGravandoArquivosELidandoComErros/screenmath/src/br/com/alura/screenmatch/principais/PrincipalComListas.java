package br.com.alura.screenmatch.principais;

import br.com.alura.screenmatch.modelos.Movie;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Title;

import java.util.ArrayList;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie favorito = new Movie("The Matrix", 1990);
        favorito.evaluate(10);

        Movie outro = new Movie("John Wick", 2014);
        outro.evaluate(9);

        Series serie = new Series("La Casa de Papel", 2017);


        ArrayList<Title> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        for(Title item : lista){
            System.out.println("Nome: " + item.getName());
            if (item instanceof Movie filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " +filme.getClassificacao());
            }
        }

        System.out.println("------------------");
        lista.sort(Comparator.comparing(Title::getReleaseyear));
        System.out.println("Ordenação por ano de lançamento: " + lista);

    }
}
