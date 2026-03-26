package workshop.builder;

import workshop.model.Order;
import workshop.model.OrderItem;

import java.util.ArrayList;
import java.util.List;

public class StandardOrderBuilder implements OrderBuilder {
    private String customerName;
    private String customerEmail;
    private String shippingAddress = "Sin dirección";
    private List<OrderItem> items = new ArrayList<>();
    private String paymentMethod = "CREDIT_CARD";
    private String discountCode = null;

    @Override
    public OrderBuilder custumerInfo(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        return this;
    }

    @Override
    public OrderBuilder shippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
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
        this.paymentMethod = "CREDIT_CARD";
        this.discountCode = null;
        return this;
    }

    @Override
    public Order build() {
        if (customerName == null || customerName.isBlank())
            throw new IllegalStateException("customerName es obligatorio");
        if (customerEmail == null || customerEmail.isBlank())
            throw new IllegalStateException("customerEmail es obligatorio");
        if (items.isEmpty())
            throw new IllegalStateException("La orden debe tener al menos un item");

        return new Order(customerName, customerEmail, shippingAddress,
                items, paymentMethod, discountCode);
    }
}
