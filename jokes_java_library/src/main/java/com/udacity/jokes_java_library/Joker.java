package com.udacity.jokes_java_library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {

    private static List<String> jokeList = new ArrayList<>();


    public static String getJoke() {

        if (jokeList.isEmpty())
            setJokes();

        // Select number for random joke
        Random rand = new Random();
        int randomNum = rand.nextInt(jokeList.size());


        return jokeList.get(randomNum);
    }

    private static void setJokes() {
        jokeList.add("Is it true that cannibals don't eat clowns because they taste funny?");
        jokeList.add("What kind of pig can you ignore at a party? \n A wild bore");
        jokeList.add("What lies on the bottom or the ocean and shakes?\n A nervous wreck");
        jokeList.add("Did you hear about the guy who blew his entire lottery winnings on a limousine? \nHe had nothing left to chauffeur it.");
        jokeList.add("If women ruled the world there would be no wars. Just a bunch of jealous countries not talking to each other.");
        jokeList.add("Chocolate comes from cocoa, which is a tree. That makes it a plant. Therefore, chocolate is salad.");
        jokeList.add("Who says nothing is impossible? \nI've been doing nothing for years.");
        jokeList.add("Why do they call it rush hour when nothing moves?");
        jokeList.add("Housework can't kill you, but why take a chance?");
        jokeList.add("How does NASA organise a party?\n They planet.");
        jokeList.add("Rest in peace boiling water. You will be mist!");
        jokeList.add("Talk is cheap? Have you ever talked to a lawyer?");
        jokeList.add("I have a fear of speed bumps. But I am slowly getting over it.");
        jokeList.add("What do you call bears with no ears?\n B.");
        jokeList.add("How do trees get online?\n They just log on!");
        jokeList.add("Why did the orange stop?\n It ran out of juice!");
        jokeList.add("What did 0 say to 8? Nice belt!");
        jokeList.add("What do you call a boomerang that doesn't work?\n A stick.");
        jokeList.add("What goes up and down but does not move?\n Stairs");
        jokeList.add("What did one toilet say to the other?\n You look a bit flushed.");
        jokeList.add("Why did the picture go to jail?\n Because it was framed.");
        jokeList.add("What did one wall say to the other wall?\n I'll meet you at the corner.");
        jokeList.add("What do you call a boy named Lee that no one talks to?\n Lonely");
        jokeList.add("Why was the broom late?\n It over swept!");
        jokeList.add("What makes the calendar seem so popular?\n  Because it has a lot of dates!");
        jokeList.add("What is it that even the most careful person overlooks?\n Her nose!");


/*        jokeList.add("");
        jokeList.add("");
        jokeList.add("");
        jokeList.add("");*/


    }
}
