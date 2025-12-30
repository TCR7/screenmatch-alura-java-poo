import br.com.alura.screenmatch.calculations.FilterRating;
import br.com.alura.screenmatch.calculations.TimeCalculation;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;

public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie();
        newMovie.setName("O Poderoso Chefão");
        newMovie.setReleaseYear(1972);
        newMovie.setDurationMinutes(175);

        newMovie.showData();

        newMovie.review(8.5);
        newMovie.review(9.0);
        newMovie.review(5);

        System.out.println("Total de avaliações: " + newMovie.getTotalReviews());
        System.out.println("Média: " + newMovie.avarageRating());

        Serie serie = new Serie();
        serie.setName("Breaking Bad");
        serie.setReleaseYear(2008);
        serie.setMinutesPerEpisode(50);
        serie.setSeasons(5);
        serie.setEpisodesPerSeason(7);
        System.out.println("Duração para maratonar Breaking Bad: " + serie.getDurationMinutes() + " minutos");

        Movie otherMovie = new Movie();
        otherMovie.setName("Matrix");
        otherMovie.setDurationMinutes(136);
        otherMovie.setReleaseYear(1999);


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
    }
}
