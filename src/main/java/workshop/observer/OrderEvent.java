package workshop.observer;

import workshop.model.Order;

import java.time.LocalDateTime;

public class OrderEvent {
    private final String eventType;
    private final Order order;
    private final LocalDateTime timestamp;

    public OrderEvent(String eventType, Order order) {
        this.eventType = eventType;
        this.order = order;
        this.timestamp = LocalDateTime.now();
    }
    public String getEventType() { return eventType; }
    public Order getOrder() { return order; }
    public LocalDateTime getTimestamp() { return timestamp; }

    @Override
    public String toString() {
        return String.format("[%s] %s — Order %s ($%.2f)",
                timestamp.toLocalTime(), eventType, order.getOrderId(), order.getTotalAmount());
    }
}
