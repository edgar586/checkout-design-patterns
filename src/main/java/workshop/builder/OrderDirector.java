package workshop.builder;

import workshop.model.Order;

public class OrderDirector {
    private final OrderBuilder builder;
    public OrderDirector(OrderBuilder builder) {
        this.builder = builder;
    }
    /** * Construye una orden de ejemplo con datos predefinidos.
     * @return La orden construida.
     */

    public Order buildDemoOrder() {
        return builder.reset()
                .custumerInfo("Demo User", "demo@test.com")
                .shippingAddress("123 Test Street")
                .addItem("Test Product A", 29.99, 2)
                .addItem("Test Product B", 49.99, 1)
                .paymentMethod("CREDIT_CARD")
                .build();
    }
    public Order buildBlackFridayOrder(String customerName, String email) {
        return builder.reset()
                .custumerInfo(customerName, email)
                .shippingAddress("Dirección pendiente")
                .addItem("Smart TV 55\"", 599.99, 1)
                .addItem("Soundbar", 149.99, 1)
                .addItem("HDMI Cable", 9.99, 3)
                .paymentMethod("CREDIT_CARD")
                .discountCode("BLACKFRIDAY")
                .build();
    }
    /*
    * Construye una orden mínima (solo campos obligatorios).
    * */
    public Order buildMinimalOrder(String customerName, String email) {
        return builder.reset()
                .custumerInfo(customerName, email)
                .addItem("Basic Product", 19.99, 1)
                .build();
    }
}
