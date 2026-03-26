package workshop.builder;

import workshop.model.Order;
import workshop.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class ExpressOrderBuilder implements OrderBuilder {
    private static final double EXPRESS_SHIPPING_FEE = 15.00;

    private String customerName;
    private String customerEmail;
    private String shippingAddress = "Sin dirección";
    private List<OrderItem> items = new ArrayList<>();
    private String paymentMethod = "PAYPAL";
    private String discountCode = null;


    @Override
    public OrderBuilder custumerInfo(String name, String email) {
        this.customerName = name;
        this.customerEmail = email;
        return this;
    }

    @Override
    public OrderBuilder shippingAddress(String address) {
        this.shippingAddress = address;
        return this;
    }

    @Override
    public OrderBuilder addItem(String productName, double price, int quantity) {
        this.items.add(new OrderItem(productName, price, quantity));
        return this;
    }

    @Override
    public OrderBuilder paymentMethod(String method) {
        this.paymentMethod = method;
        return this;
    }

    @Override
    public OrderBuilder discountCode(String code) {
        this.discountCode = code;
        return this;
    }

    @Override
    public OrderBuilder reset() {
        this.customerName = null;
        this.customerEmail = null;
        this.shippingAddress = "Sin dirección";
        items = new ArrayList<>();
        this.paymentMethod = "PAYPAL";
        this.discountCode = null;
        return this;
    }

    @Override
    public Order build() {
        if (customerName == null || customerName.isBlank()) {
            throw new IllegalStateException("Customer name is required");
        }
        if (customerEmail == null || customerEmail.isBlank()) {
            throw new IllegalStateException("Customer email is required");
        }
        if (items.isEmpty()) {
            throw new IllegalStateException("At least one item is required");
        }
        Order order = new Order(customerName, customerEmail, shippingAddress, items, paymentMethod, discountCode);
        // Agregar tarifa de envío express al total
        double totalWithExpress = order.getTotalAmount() + EXPRESS_SHIPPING_FEE;
        // Aquí podrías actualizar el total del pedido si tu modelo lo permite
        // order.setTotalAmount(totalWithExpress);
        return order;
    }
}
