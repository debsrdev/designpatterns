package org.example;

public class AdapterDemo {
    public void run() {
        Printer printer = new PrinterAdapter(new OldPrinter());
        printer.print();
    }

    public static interface Printer {
        void print();
    }

    public static class OldPrinter {
        public void printOldStyle() {
            System.out.println("Printing in old style...");
        }
    }

    public static class PrinterAdapter implements Printer {
        private OldPrinter oldPrinter;

        public PrinterAdapter(OldPrinter oldPrinter) {
            this.oldPrinter = oldPrinter;
        }

        public void print() {
            oldPrinter.printOldStyle();
        }
    }
}
