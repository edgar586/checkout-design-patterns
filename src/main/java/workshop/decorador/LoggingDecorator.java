package workshop.decorador;

import workshop.adapter.PaymentGateway;

public class LoggingDecorator extends PaymentGatewayDecorator {
    public LoggingDecorator(PaymentGateway wrapped) {
        super(wrapped);
    }

    @Override
    public boolean change(String orderId, double amount) {
        System.out.println("[LOG] Iniciando cobro: order=%s, amount=$%.2f, gateway=%s%n\",\n" +
                "                orderId, amount, wrapped.getGatewayName()");
        long start = System.currentTimeMillis();
        boolean result = super.change(orderId, amount);
        long elapsed = System.currentTimeMillis() - start;
        return result;
    }
}
