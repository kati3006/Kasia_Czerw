package com.kodilla.good.patterns;

import com.kodilla.good.patterns.chellenges.MovieStore;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        MovieStore theMovieStore = new MovieStore();
        String theBooksTitlesWithTranslations = theMovieStore.getMovies().entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(theBooksTitlesWithTranslations);

    }
}
