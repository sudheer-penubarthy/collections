package com.samples;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sudheer on 24/4/15.
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String sample = "Sudheer is testing this";
        Set<Character> sampler = new HashSet<Character>();
        for (int i=0;i<sample.length();i++){
            if(!sampler.add(sample.charAt(i))){
                System.out.println("repeating character is : "+sample.charAt(i)+ " at pos : "+i);
                //break;
            }
        }

    }

}
