package workshop.builder;

import workshop.model.Order;

public interface OrderBuilder {
    OrderBuilder custumerInfo(String name, String email);
    OrderBuilder shippingAddress(String address);
    OrderBuilder addItem(String productName, double price, int quantity);
    OrderBuilder paymentMethod(String method);
    OrderBuilder discountCode(String code);
    //Reinicia el builder para construir una nueva Order.
    OrderBuilder reset();
    //Construye y retorna la Order final.
    //      Valida que los campos obligatorios estén presentes.
    Order build();
}
