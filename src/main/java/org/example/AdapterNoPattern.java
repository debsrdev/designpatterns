package org.example;

public class AdapterNoPattern {
    public void run() {
        OldPrinter oldPrinter = new OldPrinter();
        oldPrinter.printOldStyle();
    }

    static class OldPrinter {
        public void printOldStyle() {
            System.out.println("Printing in old style...");
        }
    }
}
