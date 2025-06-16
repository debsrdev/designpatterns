package org.example;

public class FactoryNoPattern {
    public void run(){
        Dog dog = new Dog();
        dog.speak();
        Cat cat = new Cat();
        cat.speak();
    }
}

class Dog {
    public void speak() {
        System.out.println("Woof!");
    }
}
class Cat {
    public void speak() {
        System.out.println("Meow!");
    }
}
