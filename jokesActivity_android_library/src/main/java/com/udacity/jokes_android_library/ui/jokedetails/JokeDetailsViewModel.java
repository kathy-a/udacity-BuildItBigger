package com.udacity.jokes_android_library.ui.jokedetails;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class JokeDetailsViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private static  MutableLiveData<String> currentJoke = new MutableLiveData<>();


    /**
     * @return current Joke set
     */
    public LiveData<String> getCurrentJoke() {
        return currentJoke;
    }
    public void setCurrentJoke(String currentJoke) {
        this.currentJoke.setValue(currentJoke);
    }
}
