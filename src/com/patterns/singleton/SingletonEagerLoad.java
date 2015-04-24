package com.patterns.singleton;

/**
 * Created by sudheer on 27/3/15.
 */
public class SingletonEagerLoad {
    private static SingletonEagerLoad instance = new SingletonEagerLoad();

    private SingletonEagerLoad(){

    }

    private static SingletonEagerLoad getInstance(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
