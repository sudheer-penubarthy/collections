package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("livingRoom");
        Light kitchenLight = new Light("kitchen");

        Stereo stereo = new Stereo("livingRoom");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(livingRoomLight);

        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        StereoOnWithCD stereoCommand = new StereoOnWithCD(stereo);
        EmptyCommand noCommand = new EmptyCommand();

        remote.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(2, kitchenLightOn, kitchenLightOff);
        remote.setCommand(3, stereoCommand, noCommand);

        System.out.println(remote);

        remote.onButtonPushed(1);
        remote.onButtonPushed(2);
        remote.offButtonPushed(3);
        remote.offButtonPushed(2);
        remote.onButtonPushed(3);
        remote.offButtonPushed(1);
    }
}
