package com.udacity.gradle.builditbigger.backend;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;
    private String jokeList;


    public String getJokeList() {
        jokeList = "haha";
        return jokeList;
    }


    public String getData() {
        return myData;
    }

    public void setData(String data) {
        myData = data;
    }
}