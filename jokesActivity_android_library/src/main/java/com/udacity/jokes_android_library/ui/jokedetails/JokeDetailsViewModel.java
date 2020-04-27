package com.udacity.jokes_android_library.ui.jokedetails;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokeDetailsViewModel extends ViewModel {

    private static  MutableLiveData<String> sCurrentJoke = new MutableLiveData<>();
    private static List<String> sJokeList = new ArrayList<>();


    /**
     * @return jokeList
     */
    public static List<String> getsJokeList() {
        return sJokeList;
    }
    public static void setsJokeList(List<String> sJokeList) {
        JokeDetailsViewModel.sJokeList = sJokeList;
    }


    /**
     * @return current Joke
     */
    public LiveData<String> getCurrentJoke() {
        return sCurrentJoke;
    }
    public void setCurrentJoke(String currentJoke) {
        this.sCurrentJoke.setValue(currentJoke);
    }


    /** Select random joke
     */
    public void setNewRandomJoke() {
        // Select number for random joke
        Random rand = new Random();
        int randomNum = rand.nextInt(sJokeList.size());

        sCurrentJoke.setValue(sJokeList.get(randomNum));

    }
}
