package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculations.Rate;

public class Movie extends Title implements Rate {
    private String director;

    public Movie(String name, int releaseYear) {
        super(name, releaseYear);
//        this.setName(name);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) avarageRating() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getName() + " (" + getReleaseYear() + ")";
    }
}
