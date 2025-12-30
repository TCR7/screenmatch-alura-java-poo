package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rate;

public class Movie extends Title implements Rate {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return 0;
    }
}
