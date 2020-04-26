package com.udacity.jokes_android_library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.udacity.jokes_android_library.ui.jokedetails.JokeDetailsFragment;

public class JokeDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_details_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, JokeDetailsFragment.newInstance())
                    .commitNow();
        }
    }
}
