package org.example;

public class Interfaces {
}

/*an interface is a reference type that defines a set of abstract methods. It provides a contract for classes
that implement it, specifying what methods they must implement but not how they should be implemented
 */
//1.  Interfaces provide an abstraction layer that hides the implementation details of classes.
/*2. Interfaces enable polymorphism, allowing objects of different classes to be treated interchangeably if they
implement the same interface.
 */
//3.Interfaces separate the contract (what should be done) from the implementation (how it should be done).
//4.it also enables a class to inherit behavior from multiple sources, promoting code reuse and flexibility.

interface Building {
    void library();
    void toilet();
    void furnitures();
    void electricals();

}

class School implements Building {
    // Implementations for Car's methods
}

class Church implements Building {
    // Implementations for Motorcycle's methods
}

class Home implements Building {
    // Implementations for Bicycle's methods
}
