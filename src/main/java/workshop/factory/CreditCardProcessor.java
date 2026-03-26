package workshop.factory;

public class CreditCardProcessor implements PaymentProcessor {

    public boolean processPayment(double amount) {
        // Simulate credit card payment processing logic
        simulateLatency();
        System.out.println("Processing credit card payment of $" + amount);
        // In a real implementation, you would integrate with a payment gateway here
        return true; // Assume payment is successful for this example
    }

    public String getPaymentMethod() {
        return "Credit Card";
    }

    private void simulateLatency() {
        try { Thread.sleep(100); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }
}
