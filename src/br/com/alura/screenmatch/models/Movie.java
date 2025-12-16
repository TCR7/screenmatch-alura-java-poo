package br.com.alura.screenmatch.models;

public class Movie {
    private String name;
    private int releaseYear;
    private boolean includedInSubscription;
    private double ratingSums;
    private int totalReviews;
    private int durationMinutes;

    public int getTotalReviews(){
        return totalReviews;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isIncludedInSubscription() {
        return includedInSubscription;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInSubscription(boolean includedInSubscription) {
        this.includedInSubscription = includedInSubscription;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void showData(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração do filme em minutos: " + durationMinutes);
    }

    public void review(double entry){
        ratingSums += entry;
        totalReviews++;
    }

    public double avarageRating(){
        return ratingSums / totalReviews;
    }
}
