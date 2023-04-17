package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Movie extends Title implements Classificavel {
    String director;

    public Movie(String name, int releaseyear) {
        super(name, releaseyear);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) (mediumCatch() / 2);
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseyear() + ")";
    }
}
