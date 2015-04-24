package com.compare;

/**
 * Created by sudheer on 27/3/15.
 */
public class RestrictedApple extends RestrictedFruit implements Comparable<RestrictedApple>  {

    protected RestrictedApple(int size){
        super("Apple", size);
    }

    @Override
    public int compareTo(RestrictedApple apple) {
        return super.compareTo(apple);
    }
}
