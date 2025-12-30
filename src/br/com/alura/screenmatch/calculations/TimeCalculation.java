package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Movie;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculation {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void includeTime(Movie m){
//        totalTime += m.getDurationMinutes();
//    }
//
//    public void includeTime(Serie s){
//        totalTime += s.getDurationMinutes();
//    }

    public void includeTime(Title title){
        totalTime += title.getDurationMinutes();
    }
}
