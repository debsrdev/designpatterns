package org.example;

public class FactoryNoPattern {
    public void run(){
        Dog dog = new Dog();
        dog.speak();
    }
}

class Dog {
    public void speak() {
        System.out.println("Woof!");
    }
}
