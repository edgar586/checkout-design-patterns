package workshop.adapter;

public interface PaymentGateway {
    boolean change(String orderId, double amount);
    String getGatewayName();
}
