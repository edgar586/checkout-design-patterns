package workshop.model;

public class OrderItem {
    private final   String productName;
    private final double price;
    private final int quantity;

    public OrderItem (String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        return price * quantity;
    }
}
