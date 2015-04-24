package com.samples;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    private static Reverse instance;
    private static String SPACE = " ";
    private static String test;
    private static String expected;

    @Before
    public void setUp(){
        instance = new Reverse();
        test = "This is testing my program";
        expected = "program my testing is This";
    }

    @Test
    public void testReverse1(){
        String result = instance.reverse1(test, SPACE);
        assertNotNull(result);
        assertEquals(result, result);
    }

    @Test
    public void testReverse2(){
        String result = instance.reverse2(test, SPACE);
        assertNotNull(result);
        assertEquals("margorp ym gnitset si sihT", result);
    }

    @Test
    public void testReverse3(){
        String result = instance.reverse3(test, SPACE);
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    public void testReverse4(){
        String result = instance.reverse4(test, SPACE);
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    public void testReverse5(){
        String result = instance.reverse5(test, SPACE);
        assertNotNull(result);
        assertEquals(expected, result);
    }

    @Test
    public void testReverse6(){
        String result = instance.reverse6(test, SPACE);
        assertNotNull(result);
        assertEquals(expected, result);
    }
}