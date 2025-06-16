package org.example;

public class ConfigurationSingleton {
    private static ConfigurationSingleton instance;
    private String mode;

    private ConfigurationSingleton() {} // Private constructor

    public static ConfigurationSingleton getInstance() {
        if (instance == null) {
            instance = new ConfigurationSingleton();
        }
        return instance;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
