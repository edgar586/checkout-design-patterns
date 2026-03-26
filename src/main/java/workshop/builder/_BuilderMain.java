package workshop.builder;

import workshop.model.Order;

public class _BuilderMain {
    public static void main(String[] args) {
        OrderBuilder builder = new StandardOrderBuilder();
        Order order = builder
                .custumerInfo("María García", "maria@email.com")
                .shippingAddress("Av. Reforma 123, CDMX")
                .addItem("MacBook Pro 14", 1999.99, 1)
                .addItem("Magic Mouse", 79.99, 1)
                .addItem("USB-C Hub", 49.99, 2)
                .paymentMethod("CREDIT_CARD")
                .discountCode("BLACKFRIDAY")
                .build();

        System.out.println(order)  ;


    }
}
