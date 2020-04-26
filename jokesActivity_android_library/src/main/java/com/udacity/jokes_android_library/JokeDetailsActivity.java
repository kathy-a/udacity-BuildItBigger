package com.udacity.jokes_android_library;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.udacity.jokes_android_library.ui.jokedetails.JokeDetailsFragment;

public class JokeDetailsActivity extends AppCompatActivity {

    private static final String TAG = "JokeDetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_details_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, JokeDetailsFragment.newInstance())
                    .commitNow();
        }

        getJoke();


    }

    private void getJoke() {

        Intent intent = getIntent();

        if(intent != null){
            String currentJoke = intent.getStringExtra("Joke");
            Log.d(TAG, currentJoke);

            Toast.makeText(this, currentJoke, Toast.LENGTH_LONG).show();


        }else{
            Log.d(TAG, "Intent null");
        }
    }
}
