package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.udacity.jokes_android_library.JokeDetailsActivity;
import com.udacity.jokes_java_library.Joker;

import java.io.Serializable;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: REMOVE SAMPLE ASYNC TASK
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
        //endpointsAsyncTask.cancel(true);
        endpointsAsyncTask.execute(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void launchJokeActivity(View view) {

        Joker joker = new Joker();
        List<String> jokeList = joker.getJokeList();

        Class destinationActivity = JokeDetailsActivity.class;

        Intent intent = new Intent(this, destinationActivity);

        intent.putExtra("JokeList", (Serializable) jokeList);
        startActivity(intent);

    }


}
