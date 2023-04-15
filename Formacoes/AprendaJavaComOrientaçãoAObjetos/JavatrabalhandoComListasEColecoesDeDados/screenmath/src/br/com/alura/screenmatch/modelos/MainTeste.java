package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

public class MainTeste {
    public static void main(String[] args) {
        Movie favorito = new Movie("The Matrix");
        favorito.setReleaseyear(1999);
        favorito.setDurationInMinutes(135);
        favorito.setIncludedInThePlan(true);

        favorito.showedTechnicalSheet();

        Movie outro = new Movie("John Wick");
        outro.setReleaseyear(2014);
        outro.setDurationInMinutes(101);
        outro.setIncludedInThePlan(true);

        outro.showedTechnicalSheet();

        Series serie = new Series();
        serie.setName("La Casa de Papel");
        serie.setReleaseyear(2017);
        serie.setIncludedInThePlan(true);
        serie.setActive(true);
        serie.setSeasons(5);
        serie.setEpisodeBySeason(10);
        serie.setMinutesPerEpisode(45);

        serie.showedTechnicalSheet();
        System.out.println(serie.getDurationInMinutes());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();

        calculadoraDeTempo.inclui(favorito);
        calculadoraDeTempo.inclui(outro);
        calculadoraDeTempo.inclui(serie);

        System.out.println("Tempo total: "   + calculadoraDeTempo.getTempoTotal());


    }
}
