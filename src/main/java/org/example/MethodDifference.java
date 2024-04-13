package org.example;

public class MethodDifference {
}
/*DIFFERENCE BETWEEN
1. METHOD OVERLOADING
2. METHOD OVERIDING
 */

/*
1.Method Overloading:
Method overloading is the process of defining multiple methods in the same class with the same name but different
parameters.
It allows a class to have multiple methods with the same name but different behaviors based on the types or number
of parameters passed to them.

EXAMPLE:
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
*/

/*
2. Method Overriding:
Method overriding is the process of redefining a method in a subclass with the same signature (name and parameters)
as a method in its superclass.
It allows a subclass to provide its own implementation of a method defined in its superclass, thereby altering or
extending the behavior of the inherited method.

Example:
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
 */