public class Movie {
    String name;
    int releaseYear;
    boolean includedInSubscription;
    double ratingSums;
    int totalReviews;
    int durationMinutes;

    void showData(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração do filme em minutos: " + durationMinutes);
    }

    void review(double entry){
        ratingSums += entry;
        totalReviews++;
    }

    double avarageRating(){
        return ratingSums / totalReviews;
    }
}
