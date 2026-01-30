package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;

public class MainWithLists {
    public static void main(String[] args) {
        Movie newMovie = new Movie("O Poderoso Chefão", 1972);
        newMovie.review(9.0);
        Movie otherMovie = new Movie("Matrix", 1999);
        otherMovie.review(8.5);
        Movie anotherMovie = new Movie("John Wick", 2014);
        anotherMovie.review(7.5);
        Serie serie = new Serie("Breaking Bad", 2008);

        ArrayList<Title> list = new ArrayList<>();
        list.add(anotherMovie);
        list.add(otherMovie);
        list.add(newMovie);
        list.add(serie);

        for(Title item : list){
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getRating() > 2){
                System.out.println("Classificação: " + movie.getRating());
            }
        }
    }

}
