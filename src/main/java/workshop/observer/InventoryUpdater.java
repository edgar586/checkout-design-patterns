package workshop.observer;

public class InventoryUpdater implements OrderEventListener {
    public void onEvent(OrderEvent event) {
        event.getOrder().getItems().forEach(item ->
                System.out.printf("  [INVENTORY] Descontando %d unidades de '%s'%n",
                        item.getQuantity(), item.getProductName())
        );
    }
}
