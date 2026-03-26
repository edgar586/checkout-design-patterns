package workshop.model;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String orderId;
    private final String customerName;
    private final String customerEmail;
    private final String shippingAddress;
    private final List<OrderItem> items;
    private final String paymentMethod;
    private final String discountCode;
    private double totalAmount;
    private String status;;

    public Order(String customerName, String customerEmail, String shippingAddress,
                 List<OrderItem> items, String paymentMethod, String discountCode) {
        this.orderId = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.shippingAddress = shippingAddress;
        this.items = items;
        this.paymentMethod = paymentMethod;
        this.discountCode = discountCode;
        this.totalAmount = calculateTotalAmount();
        this.status = "CREATED";
    }

    private double calculateTotalAmount() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getShippingAddress() { return shippingAddress; }
    public List<OrderItem> getItems() { return Collections.unmodifiableList(items); }
    public String getPaymentMethod() { return paymentMethod; }
    public String getDiscountCode() { return discountCode; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }

    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
    public void setStatus(String status) { this.status = status; }

    public String toString() {
        return String.format("Order{id='%s', customer='%s', email='%s', address='%s', items=%d, payment='%s', discount='%s', total=%.2f, status='%s'}",
                orderId, customerName, customerEmail, shippingAddress, items.size(), paymentMethod, discountCode, totalAmount, status);
    }
}
