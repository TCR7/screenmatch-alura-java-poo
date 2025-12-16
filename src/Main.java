import br.com.alura.screenmatch.models.Movie;

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
    }
}
