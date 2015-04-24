package com.tmp;

/**
 * Created by sudheer on 8/4/15.
 */
public class Cat extends Animal {

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    @Override
    public void testInstanceMethod() {
        System.out.println("Instance method in cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;

        myAnimal.testInstanceMethod();
        Animal.testClassMethod();

    }
}
