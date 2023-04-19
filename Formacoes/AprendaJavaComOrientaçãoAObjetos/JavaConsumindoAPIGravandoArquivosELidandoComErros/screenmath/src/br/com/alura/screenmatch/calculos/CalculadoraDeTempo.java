package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

/*    public void inclui(Movie f){
        tempoTotal += f.getDurationInMinutes();
    }
    public void inclui(Series s){
        tempoTotal += s.getDurationInMinutes();
    }*/

    public void inclui (Title title){
        tempoTotal += title.getDurationInMinutes();
    }


}
