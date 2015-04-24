package com.samples;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by sudheer on 17/3/15.
 */
public class Reverse {
    protected static final String SPACE = " ";
    protected static final String RESULT = "times? different there are why and write. to difficult so is this that is Why";

    public static void main(String[] args) {
        String test = "Why is that this is so difficult to write. and why are there different times?";
        System.out.println("Original : "+test);
        calculate(1, test);
        calculate(2, test);
        calculate(3, test);
        calculate(4, test);
        calculate(5, test);
        calculate(6, test);

    }

    public String reverse1(String source, String token){
        List<String> tokens = Arrays.asList(source.split(token));
        Stack<String> stack = new Stack<String>();
        for(String elem : tokens){
            stack.push(elem);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            sb.append(token);
        }
        return sb.toString().trim();
    }

    public String reverse2(String source, String token){
        List<String> tokens = Arrays.asList(source.split(token));
        StringBuffer sb = new StringBuffer();
        for(String elem : tokens){
            sb.append(elem);
            sb.append(token);
        }
        return sb.reverse().toString().trim();
    }

    public String reverse3(String source, String token){
        List<String> elements = new LinkedList<String>();
        elements = Arrays.asList(source.split(token));
        ListIterator<String> iterator = elements.listIterator(elements.size());
        StringBuilder sb = new StringBuilder();
        while(iterator.hasPrevious()){
            sb.append(iterator.previous());
            sb.append(token);
        }
        return sb.toString().trim();
    }

    public String reverse4(String source, String token){
        List<String> tokens = Arrays.asList(source.split(token));
        StringBuilder sb = new StringBuilder();
        for (int i = tokens.size(); i >0 ; i--) {
            sb.append(tokens.get(i-1));
            sb.append(SPACE);
        }
        return sb.toString().trim();
    }

    public String reverse5(String source, String token){
        List<String> tokens = Arrays.asList(source.split(token));
        ListIterator<String> iterator = tokens.listIterator(tokens.size());
        StringBuilder sb = new StringBuilder();
        while(iterator.hasPrevious()){
            sb.append(iterator.previous());
            sb.append(token);
        }
        return sb.toString().trim();
    }

    public String reverse6(String source, String token){
        String[] tokens = source.split(token);
        StringBuilder sb = new StringBuilder();
        for (int i = tokens.length - 1; i >= 0; i--) {
            sb.append(tokens[i]);
            sb.append(SPACE);
        }
        return sb.toString().trim();
    }

    public static void calculate(int method, String data){

        try {

            String name = "reverse"+method;
            Method func = Reverse.class.getDeclaredMethod(name, new Class<?>[]{String.class, String.class});
            Reverse reverse = new Reverse();
            try {
                double startTime = System.nanoTime();
                String result = (String) func.invoke(reverse, new String[]{data, SPACE});
                double endTime = System.nanoTime();
                double duration = (endTime - startTime)/1000000;
                if(result.equals(RESULT)){
                    System.out.println(name+" executed in : "+duration);
                }else{
                    System.out.println("result = " + result);
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
