package com.patterns.command;

/**
 * Created by sudheer on 27/3/15.
 */
public class EmptyCommand implements Command {

    @Override
    public void execute() {
        // Nothing to do for now...
        System.out.println("No Command Assigned....");
    }
}
