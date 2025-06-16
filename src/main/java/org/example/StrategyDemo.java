package org.example;

public class StrategyDemo {
    public void run() {
        PaymentStrategy strategy = new CreditCardPayment();
        ShoppingCart cart = new ShoppingCart(strategy);
        cart.checkout(50);
    }

    public static interface PaymentStrategy {
        void pay(int amount);
    }

    public static class CreditCardPayment implements PaymentStrategy {
        public void pay(int amount) {
            System.out.println("Paid " + amount + " with credit card");
        }
    }

    public static class ShoppingCart {
        private final PaymentStrategy strategy;

        public ShoppingCart(PaymentStrategy strategy) {
            this.strategy = strategy;
        }

        public void checkout(int amount) {
            strategy.pay(amount);
        }
    }
}
