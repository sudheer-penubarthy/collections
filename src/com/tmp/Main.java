package com.tmp;

/**
 * Created by sudheer on 8/4/15.
 */
public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.method1();
        b.method3();

        Base c = new Child();
        c.method1();
        //c.method2();
        c.method3();

        Child d = new Child();
        d.method1();
        d.method2();
        d.method3();
    }
}
