package org.example;

public class SolidPrinciples {
}

/*
1.Single Responsibility Principle (SRP):A class should have only one reason to change.
meaning it should have only one responsibility.This principle states that a class should have only one job or
responsibility. If a class has multiple responsibilities, it becomes harder to understand, maintain, and extend.
By adhering to SRP, classes become smaller, focused, and easier to test. Each class becomes responsible
for a single aspect of the system's behavior, which leads to better modularization and reduces the ripple
effect of changes.
It Promotes code organization, enhances maintainability, reduces coupling, and improves readability.
Example:
public class Employee{
public Money calculatePay();
public String reportHours();
public void save();
}
 */

/*
2.Open/Closed Principle (OCP):
This principle states that Software entities (classes, modules, functions, etc.) should be open for extension but
closed for modification.This principle encourages developers to design software components that can be extended
without modifying their source code. Instead of changing existing code, new functionality should be added through
inheritance, composition, or abstraction. By adhering to OCP, developers can introduce new features or behaviors
without altering existing code, which minimizes the risk of introducing bugs and preserves the stability of the
system.
This Promotes code reuse, facilitates extensibility, reduces regression errors, and encourages modular design.
 */

/*
3.Liskov Substitution Principle (LSP):
This Principle says Subtypes must be substitutable for their base types without affecting the correctness of the
program.
This principle emphasizes the importance of maintaining behavioral compatibility between derived classes (subtypes)
and their base classes (super types). In other words, derived classes should be usable in place of their base
classes without altering the desired behavior of the program. Violating LSP can lead to unexpected behavior and
logical errors.
It also ensures behavioral consistency, promotes polymorphism, enhances code reliability, and enables code reuse.
 */

/*
4.Interface Segregation Principle (ISP):
This Principle says that Clients should not be forced to depend on interfaces they do not use.
i.e ISP suggests that interfaces should be fine-grained and specific to the requirements of the clients that use
them. Instead of creating large, monolithic interfaces, developers should design smaller, focused interfaces
tailored to the needs of individual clients. This prevents clients from being burdened with unnecessary dependencies
and allows for better decoupling between components.
This reduces coupling, prevents interface pollution, improves maintainability, and enables better code organization.
 */

/*
5.Dependency Inversion Principle (DIP):
This Principle states that High-level modules should not depend on low-level modules. Both should depend on abstractions.
Abstractions should not depend on details. Details should depend on abstractions.
DIP encourages developers to write code that depends on abstractions rather than concrete implementations. High-level
modules should not rely directly on low-level modules but should depend on interfaces or abstract classes instead.
This promotes loose coupling between modules and allows for easier substitution of dependencies. By programming to
interfaces, developers can create flexible, extensible systems that are easier to maintain and test.
This helps to enhance flexibility, promotes code reuse, facilitates unit testing, and enables easier refactoring.
 */