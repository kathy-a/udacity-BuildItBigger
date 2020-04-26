package com.udacity.jokes_android_library;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.udacity.jokes_android_library.ui.jokedetails.JokeDetailsFragment;
import com.udacity.jokes_android_library.ui.jokedetails.JokeDetailsViewModel;

public class JokeDetailsActivity extends AppCompatActivity {

    private static final String TAG = "JokeDetailsActivity";
    private JokeDetailsViewModel mViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_details_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, JokeDetailsFragment.newInstance())
                    .commitNow();
        }

        initViewMode();
        getJoke();


    }

    private void initViewMode() {
        mViewModel = ViewModelProviders.of(this).get(JokeDetailsViewModel.class);

    }

    private void getJoke() {

        Intent intent = getIntent();

        if(intent != null){
            String joke = intent.getStringExtra("Joke");
    //        Log.d(TAG, joke);

            //Toast.makeText(this, joke, Toast.LENGTH_LONG).show();
            mViewModel.setCurrentJoke(joke);

        }else{
            Log.d(TAG, "Intent null");
        }
    }
}
