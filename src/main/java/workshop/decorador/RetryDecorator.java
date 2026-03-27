package workshop.decorador;

import workshop.adapter.PaymentGateway;

public class RetryDecorator extends PaymentGatewayDecorator {

    private final int maxRetries;
    private final long delayMs;

    public RetryDecorator(PaymentGateway wrapped, int maxRetries, long delayMs) {
        super(wrapped);
        this.maxRetries = maxRetries;
        this.delayMs = delayMs;
    }

    public boolean change(String orderId, double amount) {
        for (int attempt = 1; attempt <= maxRetries; attempt++) {
            System.out.printf("  [RETRY] Intento %d/%d para order=%s%n", attempt, maxRetries, orderId);
            boolean result = super.change(orderId, amount);
            if (result) {
                return true;
            }
        }
        System.out.printf("  [RETRY] Agotados %d intentos para order=%s%n", maxRetries, orderId);
        return false;
    }
}