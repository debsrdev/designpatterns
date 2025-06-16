package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*
        // Configuration without pattern
        ConfigurationWithoutPattern config1 = new ConfigurationWithoutPattern("Dark");
        ConfigurationWithoutPattern config2 = new ConfigurationWithoutPattern("Light");

        System.out.println(config1.mode);
        System.out.println(config2.mode);
*/
/*
        // Configuration with Singleton Pattern
        ConfigurationSingleton config1 = ConfigurationSingleton.getInstance();
        config1.setMode("Dark");
        System.out.println(config1.getMode()); // Dark

        ConfigurationSingleton config2 = ConfigurationSingleton.getInstance();
        System.out.println(config2.getMode()); // Dark, same instance

        config2.setMode("Light");
        System.out.println(config2.getMode()); // Light
        System.out.println(config1.getMode()); // Light, same instance

 */
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n ***** Design patterns ***** ");
            System.out.println("1. Factory - no patterns");
            System.out.println("2. Factory - with patterns");
            System.out.println("3. Adapter - no patterns");
            System.out.println("4. Adapter - with patterns");
            System.out.println("5. Strategy - no patterns");
            System.out.println("6. Strategy - with patterns");
            System.out.println("0. Exit");
            System.out.println("Please choose an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    new FactoryNoPattern().run();
                    break;
                case 2:
                    new FactoryDemo().run();
                    break;
                case 3:
                    new AdapterNoPattern().run();
                    break;
                case 4:
                    new AdapterDemo().run();
                    break;
                case 5:
                    new StrategyNoPattern().run();
                    break;
                case 6:
                    new StrategyDemo().run();
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
                    break;

            }
        } while (option != 0);

        scanner.close();
    }
}