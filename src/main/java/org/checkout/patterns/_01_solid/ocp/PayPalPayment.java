package org.checkout.patterns._01_solid.ocp;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pago con PayPal");
    }
}
