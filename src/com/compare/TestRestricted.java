package com.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sudheer on 27/3/15.
 */
public class TestRestricted {
    public static void main(String[] args) {
        RestrictedApple a1 = new RestrictedApple(1);
        RestrictedApple a2 = new RestrictedApple(2);
        RestrictedOrange o3 = new RestrictedOrange(3);
        RestrictedOrange o4 = new RestrictedOrange(4);

        List<RestrictedApple> apples = Arrays.asList(a1, a2);
        assert Collections.max(apples).equals(a2);
        System.out.println("max apple : "+Collections.max(apples));
        System.out.println("min apple : "+Collections.min(apples));

        List<RestrictedOrange> oranges = Arrays.asList(o3, o4);
        assert Collections.max(oranges).equals(o4);
        System.out.println("max orange : "+Collections.max(oranges));
        System.out.println("min orange : "+Collections.min(oranges));

        /*
        Below block is not correct because we believe apples and oranges cannot be compared

        List<Fruit> mixed = Arrays.<Fruit>asList(a1, o3);
        assert Collections.max(mixed).equals(o3);
        */
    }
}
