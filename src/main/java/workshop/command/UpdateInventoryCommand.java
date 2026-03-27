package workshop.command;

import workshop.model.Order;

public class UpdateInventoryCommand implements OrderCommand {
    private final Order order;

    public UpdateInventoryCommand(Order order) {
        this.order = order;
    }

    @Override
    public boolean execute() {
        System.out.printf("  [CMD] Ejecutando: %s%n", getCommandName());
        order.getItems().forEach(item ->
                System.out.printf(" Actualizando stock: -%d '%s'%n",
                        item.getQuantity(), item.getProductName())
        );
        return true;
    }

    @Override
    public String getCommandName() {
        return "UpdateInventory(order=" + order.getOrderId() + ")";
    }

}
