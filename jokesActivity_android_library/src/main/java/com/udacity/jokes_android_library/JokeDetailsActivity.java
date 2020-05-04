package com.udacity.jokes_android_library;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.udacity.jokes_android_library.ui.jokedetails.JokeDetailsFragment;
import com.udacity.jokes_android_library.ui.jokedetails.JokeDetailsViewModel;

import java.util.List;

public class JokeDetailsActivity extends AppCompatActivity {

    private static final String TAG = "JokeDetailsActivity";
    private static final String INTENT_EXTRA = "JokeList";
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

    public void getRandomJoke(View view) {
        mViewModel.setNewRandomJoke();

    }

    private void getJoke() {

        Intent intent = getIntent();

        if(intent != null && intent.hasExtra(INTENT_EXTRA)){
            List<String> jokeList = (List<String>) intent.getSerializableExtra(INTENT_EXTRA);

            // Set joke list for view Model
            mViewModel.setsJokeList(jokeList);

            //Select random joke
            mViewModel.setNewRandomJoke();

        }else{
            Log.d(TAG, "Intent null");
        }
    }
}
