package org.example;

public class StrategyNoPattern {
    public void run() {
        ShoppingCart cart = new ShoppingCart();
        cart.checkoutWithCreditCard(50);
    }
}

class ShoppingCart {
    public void checkoutWithCreditCard(int amount) {
        System.out.println("Paid " + amount + " with credit card");
    }
}
