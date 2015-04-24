package com.patterns.singleton;

/**
 * Created by sudheer on 27/3/15.
 */
public class SingletonSimple {
    private static SingletonSimple instance;

    private SingletonSimple(){
        // Nothing to do here
    }

    public static synchronized SingletonSimple getInstance(){
        if(instance == null){
            instance = new SingletonSimple();
        }
        return instance;
    }
}
