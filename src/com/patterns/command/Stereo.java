package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class Stereo {
    int volume = 0;
    String description = "";

    private Stereo(){

    }

    public Stereo(String description) {
        this.description = description;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCD() {
        System.out.println(description+" inserted CD");
    }

    public void on() {
        System.out.println(description+" stereo is turned on...");
    }
}
