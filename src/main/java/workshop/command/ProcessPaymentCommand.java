package workshop.command;

import workshop.adapter.PaymentGateway;
import workshop.model.Order;

public class ProcessPaymentCommand implements OrderCommand {
    private final Order order;
    private final PaymentGateway gateway;

    public ProcessPaymentCommand(Order order, PaymentGateway gateway) {
        this.order = order;
        this.gateway = gateway;
    }

    @Override
    public boolean execute() {
        System.out.printf("  [CMD] Ejecutando: %s%n", getCommandName());
        return gateway.change(order.getOrderId(), order.getTotalAmount());
    }

    @Override
    public String getCommandName() {
        return "ProcessPayment(order=" + order.getOrderId() + ")";
    }
}
