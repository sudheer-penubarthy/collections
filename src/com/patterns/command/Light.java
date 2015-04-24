package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class Light {
    String description = "";

    public Light(String description) {
        this.description = description;
    }

    private Light(){
        // Need description about the light...
    }

    public void on(){
        System.out.println(description+" light is switched on...");
    }

    public void off() {
        System.out.println(description+" light is switched off...");
    }
}
