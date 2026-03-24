package org.checkout.patterns._01_solid.ocp;

public class _PaymentProcessor {

    public void pay(String paymentType) {
        if ("CARD".equals(paymentType)) {
            System.out.println("Pago con tarjeta");
        }
        else if ("PAYPAL".equals(paymentType)) {
            System.out.println("Pago con PayPal");
        }
        else if ("TRANSFER".equals(paymentType)) {
            System.out.println("Pago con transferencia");
        }
        else {
            throw new IllegalArgumentException("Tipo de pago no soportado: " + paymentType);
        }
    }
}
