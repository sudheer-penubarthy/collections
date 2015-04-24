package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class StereoOnWithCD implements Command{
    Stereo stereo;

    public StereoOnWithCD(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
