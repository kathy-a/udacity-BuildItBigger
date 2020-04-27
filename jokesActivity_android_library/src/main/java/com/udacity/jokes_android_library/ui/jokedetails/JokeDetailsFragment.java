package com.udacity.jokes_android_library.ui.jokedetails;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.jokes_android_library.R;

public class JokeDetailsFragment extends Fragment {

    private JokeDetailsViewModel mViewModel;
    private static final String TAG = "JokeDetailsFragment";
    private View rootView;


    public static JokeDetailsFragment newInstance() {
        return new JokeDetailsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       // return inflater.inflate(R.layout.joke_details_fragment, container, false);

        rootView = inflater.inflate(R.layout.joke_details_fragment, container, false);

        return rootView;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        initViewModel();

        //getRandomJoke();




    }



    private void initViewModel() {
        mViewModel = ViewModelProviders.of(this).get(JokeDetailsViewModel.class);

        final TextView textJoke= rootView.findViewById(R.id.text_joke);


        //Observer of currentJoke
        mViewModel.getCurrentJoke().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String joke) {
                Log.d(TAG, "JOKE: "+ joke);
                textJoke.setText(joke);

            }
        });

    }


}
