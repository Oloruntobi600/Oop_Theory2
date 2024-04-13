package org.example;

public class StaticAndDynamic {
}

/*
Dynamic Binding (Late Binding):

Dynamic binding refers to the process of linking a method call with the method implementation during runtime.
It occurs when the method to be invoked is determined based on the actual type of the object at runtime, rather than
the type of the reference variable.
Dynamic binding allows for polymorphic behavior, where the same method call may produce different results depending
on the actual type of the object.
Dynamic binding is achieved using method overriding, where a subclass provides a specific implementation of a method
declared in its superclass.

Example:
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Dynamic binding
    }
 */
