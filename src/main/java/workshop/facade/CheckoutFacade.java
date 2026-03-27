package workshop.facade;

import workshop.adapter.PaymentGateway;
import workshop.model.Order;
import workshop.strategy.DiscountStrategy;

public class CheckoutFacade {

    private final DiscountStrategy discountStrategy;
    private final PaymentGateway paymentGateway;

    public CheckoutFacade(DiscountStrategy discountStrategy,
                          PaymentGateway paymentGateway){
        this.discountStrategy = discountStrategy;
        this.paymentGateway = paymentGateway;
    }
    public boolean placeOrder(Order order) {
        System.out.println("INICIANDO CHECKOUT");
        System.out.println(order);

        // Paso 1: Aplicar descuento (Strategy)
        System.out.printf("Estrategia de descuento: %s%n", discountStrategy.getDescription());
        double originalTotal = order.getTotalAmount();
        double discountedTotal = discountStrategy.applyDiscount(order.getTotalAmount());
        order.setTotalAmount(discountedTotal);
        System.out.printf("  	Total: $%.2f → $%.2f%n", originalTotal, discountedTotal);

        // Paso 2: Procesar pago (Gateway + Decorators)
        System.out.printf("%n Procesando pago via %s%n", paymentGateway.getGatewayName());
        boolean paymentSuccess = paymentGateway.change(order.getOrderId(), discountedTotal);
        if (!paymentSuccess) {
            order.setStatus("PAYMENT_FAILED");
            System.out.println("\n ═══ CHECKOUT FALLIDO ═══");
            return false;
        }
        return true;
    }


    // Paso 3: Actualizar estado y notificar (Observer)

}
