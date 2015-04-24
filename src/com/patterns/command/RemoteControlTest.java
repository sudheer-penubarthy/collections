package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("livingRoom");
        LightOnCommand lighton = new LightOnCommand(light);

        remote.setCommand(lighton);
        remote.buttonWasPressed();
    }
}
