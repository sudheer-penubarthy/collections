package com.patterns.singleton;

/**
 * Created by sudheer on 27/3/15.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
