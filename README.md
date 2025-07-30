📘 Inheritance in Java
Inheritance is a core concept in Object-Oriented Programming (OOP) that allows one class to acquire the properties and behaviors (fields and methods) of another class. The class that inherits is called the subclass or child class, and the class being inherited from is called the superclass or parent class.

Inheritance promotes code reusability, method overriding, and polymorphism, making it easier to manage and extend code.

🔰 Types of Inheritance in Java
1. Single Inheritance
In this type, a subclass inherits from only one superclass. This is the most basic form of inheritance in Java.

2. Multilevel Inheritance
Here, a class inherits from a subclass, which in turn inherits from another superclass, forming a chain of inheritance.

3. Hierarchical Inheritance
In this type, multiple subclasses inherit from a single superclass. This allows sharing of common functionality across different classes.

4. Hybrid Inheritance
Hybrid inheritance is a combination of two or more types of inheritance. While Java does not support hybrid inheritance directly through classes (due to ambiguity issues), it can be achieved using interfaces.

❌ Multiple Inheritance (Not Supported with Classes)
Java does not support multiple inheritance with classes to avoid the diamond problem, where ambiguity arises due to multiple paths of inheritance. However, Java supports multiple inheritance through interfaces.

