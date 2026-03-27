package workshop.observer;

public class AnalyticsTracker implements OrderEventListener {
    @Override
    public void onEvent(OrderEvent event) {
        System.out.printf("  [ANALYTICS] Tracking event: %s — revenue=$%.2f%n",
                event.getEventType(), event.getOrder().getTotalAmount());
    }
}
