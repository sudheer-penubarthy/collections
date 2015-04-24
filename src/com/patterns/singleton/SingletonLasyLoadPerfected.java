package com.patterns.singleton;

/**
 * Created by sudheer on 27/3/15.
 */
public class SingletonLasyLoadPerfected {
    private static SingletonLasyLoadPerfected instance;

    private SingletonLasyLoadPerfected(){

    }

    static{
        instance = new SingletonLasyLoadPerfected();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static SingletonLasyLoadPerfected getInstance(){
        return instance;
    }

    private static Class getClass(String className) throws ClassNotFoundException{
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        if(classloader == null){
            classloader = SingletonLasyLoadPerfected.class.getClassLoader();
        }
        return classloader.loadClass(className);
    }
}
