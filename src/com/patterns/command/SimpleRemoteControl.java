package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
