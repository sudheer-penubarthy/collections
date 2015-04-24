package com.compare;

/**
 * Created by sudheer on 27/3/15.
 */
public class RestrictedOrange extends RestrictedFruit implements Comparable<RestrictedOrange>{

    protected RestrictedOrange(int size) {
        super("Orange", size);
    }

    @Override
    public int compareTo(RestrictedOrange orange) {
        return super.compareTo(orange);
    }
}
