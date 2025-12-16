public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie();
        newMovie.name = "O Poderoso Chefão";
        newMovie.releaseYear = 1972;
        newMovie.durationMinutes = 175;

        newMovie.showData();

        newMovie.review(8.5);
        newMovie.review(9.0);
        newMovie.review(5);

        System.out.println("Total de avaliações: " + newMovie.getTotalReviews());
        System.out.println("Média: " + newMovie.avarageRating());
    }
}
