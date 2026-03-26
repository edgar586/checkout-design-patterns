package workshop.factory;

public class PayPalPayment implements PaymentProcessor {

    public boolean processPayment(double amount) {
        // Simulate PayPal payment processing logic
        simulateLatency();
        System.out.println("Processing PayPal payment of $" + amount);
        // In a real implementation, you would integrate with PayPal's API here
        return true; // Assume payment is successful for this example
    }

    public String getPaymentMethod() {
        return "PayPal";
    }

    private void simulateLatency() {
        try { Thread.sleep(80); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
