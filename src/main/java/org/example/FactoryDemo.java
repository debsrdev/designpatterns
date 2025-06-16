package org.example;

public class FactoryDemo {
    public void run() {
        Animal animal1 = AnimalFactory.createAnimal("dog");
        Animal animal2 = AnimalFactory.createAnimal("cat");

        animal1.speak(); // Woof!
        animal2.speak(); // Meow!
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
    public static class Cat implements Animal {
        public void speak() {
            System.out.println("Meow!");
        }
    }

    // Factory that decides which object to create
    public static class AnimalFactory {
        public static Animal createAnimal(String type) {
            return switch (type.toLowerCase()) {
                case "dog"->new Dog();
                case "cat" -> new Cat();
                default -> throw new IllegalArgumentException("Unknown animal type: " + type);            };
        }
    }
}
