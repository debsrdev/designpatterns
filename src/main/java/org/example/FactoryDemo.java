package org.example;

public class FactoryDemo {
    public void run() {
        Animal animal = AnimalFactory.createAnimal("dog");
        animal.speak();
    }

    // Common interface
    public static interface Animal {
        void speak();
    }

    // Concrete implementation
    public static class Dog implements Animal {
        public void speak() {
            System.out.println("Woof!");
        }
    }

    // Factory that decides which object to create
    public static class AnimalFactory {
        public static Animal createAnimal(String type) {
            return switch (type.toLowerCase()) {
                case "dog"->new Dog();
                default -> throw new IllegalArgumentException("Unknown animal type: " + type);            };
        }
    }
}
