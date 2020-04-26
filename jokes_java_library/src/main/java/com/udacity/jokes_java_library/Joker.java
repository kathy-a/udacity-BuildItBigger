package com.udacity.jokes_java_library;

import java.util.ArrayList;
import java.util.List;

public class Joker {

    private static List<String> jokeList = new ArrayList<>();


    public static String getJoke() {

        setJokes();

        return jokeList.get(1);
    }

    private static void setJokes() {
        jokeList.add("Is it true that cannibals don't eat clowns because they taste funny?");
        jokeList.add("What kind of pig can you ignore at a party? A wild bore");
        jokeList.add("What lies on the bottom or the ocean and shakes? A nervous wreck");


    }
}
