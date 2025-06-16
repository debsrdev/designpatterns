package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n ***** Design patterns ***** ");
            System.out.println("0. Example - Configuration Demo");
            System.out.println("1. Factory - no patterns");
            System.out.println("2. Factory - with patterns");
            System.out.println("3. Adapter - no patterns");
            System.out.println("4. Adapter - with patterns");
            System.out.println("5. Strategy - no patterns");
            System.out.println("6. Strategy - with patterns");
            System.out.println("7. Exit");
            System.out.println("Please choose an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 0:
                    ConfigurationDemo.run();
                    break;
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
                case 7:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again");
                    break;

            }
        } while (option != 7);

        scanner.close();
    }
}