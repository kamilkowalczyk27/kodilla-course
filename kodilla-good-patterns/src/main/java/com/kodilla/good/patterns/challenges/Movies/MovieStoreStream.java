package com.kodilla.good.patterns.challenges.Movies;

import java.util.stream.Collectors;

public class MovieStoreStream {

    public static void main(String[] args) {
        String moviesNames = MovieStore.getMovies().entrySet().stream()
                .flatMap(s -> s.getValue().stream())
                .collect(Collectors.joining("! "));

        System.out.println(moviesNames);
    }
}
