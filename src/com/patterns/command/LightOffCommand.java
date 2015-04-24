package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
