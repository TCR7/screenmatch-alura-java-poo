import br.com.alura.screenmatch.calculations.FilterRating;
import br.com.alura.screenmatch.calculations.TimeCalculation;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie("O Poderoso Chefão", 1972);
        newMovie.setDurationMinutes(175);

        newMovie.showData();

        newMovie.review(8.5);
        newMovie.review(9.0);
        newMovie.review(5);

        System.out.println("Total de avaliações: " + newMovie.getTotalReviews());
        System.out.println("Média: " + newMovie.avarageRating());

        Serie serie = new Serie("Breaking Bad", 2008);
        serie.setMinutesPerEpisode(50);
        serie.setSeasons(5);
        serie.setEpisodesPerSeason(7);
        System.out.println("Duração para maratonar Breaking Bad: " + serie.getDurationMinutes() + " minutos");

        Movie otherMovie = new Movie("Matrix", 1999);
        otherMovie.setDurationMinutes(136);


        TimeCalculation calculator = new TimeCalculation();
        calculator.includeTime(newMovie);
        calculator.includeTime(otherMovie);
        calculator.includeTime(serie);
        System.out.println("Tempo total de filmes: " + calculator.getTotalTime() + " minutos");

        FilterRating filterRating = new FilterRating();
        filterRating.filter(newMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setTotalViews(300);
        filterRating.filter(episode);

        Movie anotherMovie = new Movie("John Wick", 2014);
        anotherMovie.setDurationMinutes(101);
        anotherMovie.review(8);

        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(anotherMovie);
        movieList.add(otherMovie);
        movieList.add(newMovie);
        System.out.println("Quantidade de filmes: " + movieList.size());
        System.out.println("Primeiro filme: " + movieList.get(0).getName());
        System.out.println("lista de filmes: " + movieList.toString());



    }
}
