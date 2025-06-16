package org.example;

public class ConfigurationDemo {
    public static void run() {

        // Configuration without pattern
        ConfigurationWithoutPattern config1 = new ConfigurationWithoutPattern("Dark");
        ConfigurationWithoutPattern config2 = new ConfigurationWithoutPattern("Light");

        System.out.println(config1.mode);
        System.out.println(config2.mode);

/*        // Configuration with Singleton Pattern
        ConfigurationSingleton config1 = ConfigurationSingleton.getInstance();
        config1.setMode("Dark");
        System.out.println(config1.getMode()); // Dark

        ConfigurationSingleton config2 = ConfigurationSingleton.getInstance();
        System.out.println(config2.getMode()); // Dark, same instance

        config2.setMode("Light");
        System.out.println(config2.getMode()); // Light
        System.out.println(config1.getMode()); // Light, same instance*/

    }
}
