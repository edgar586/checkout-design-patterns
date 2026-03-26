package workshop.factory;

public interface PaymentProcessor {
    boolean processPayment(double amount);
    String getPaymentMethod();
}
