package workshop.command;

import workshop.model.Order;

public class SendConfirmationCommand {

    private final Order order;

    public SendConfirmationCommand(Order order) {
        this.order = order;
    }

    public boolean execute() {
        System.out.printf("  [CMD] Ejecutando: %s%n", getCommandName());
        System.out.printf("  Enviando confirmación a %s para order %s%n",
                order.getCustomerEmail(), order.getOrderId());
        return true;
    }

    public String getCommandName() {
        return "SendConfirmation(order=" + order.getOrderId() + ")";
    }
}
