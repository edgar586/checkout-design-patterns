package workshop.observer;

public class EmailNotifier implements OrderEventListener {
    @Override
    public void onEvent(OrderEvent event) {
        System.out.printf("  [EMAIL] Enviando confirmación a %s — Order %s%n",
                event.getOrder().getCustomerEmail(), event.getOrder().getOrderId());
    }
}
