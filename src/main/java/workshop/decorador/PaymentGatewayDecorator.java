package workshop.decorador;

import workshop.adapter.PaymentGateway;

public class PaymentGatewayDecorator implements PaymentGateway {
    protected final PaymentGateway wrapped;

    public PaymentGatewayDecorator(PaymentGateway wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public boolean change(String orderId, double amount) {
        return wrapped.change(orderId,amount);
    }

    @Override
    public String getGatewayName() {
        return wrapped.getGatewayName();
    }
}
