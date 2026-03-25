package org.checkout.patterns._00_smell_antipatrones;

public class _001_CheckoutPayment {
    public void processPayment(String paymentType, double amount) {
        if ("CARD".equals(paymentType)) {
            System.out.println("Validando tarjeta...");
            System.out.println("Procesando pago con tarjeta por: " + amount);
        } else if ("PAYPAL".equals(paymentType)) {
            System.out.println("Conectando con PayPal...");
            System.out.println("Procesando pago con PayPal por: " + amount);
        } else if ("TRANSFER".equals(paymentType)) {
            System.out.println("Generando referencia bancaria...");
            System.out.println("Procesando transferencia por: " + amount);
        }
        else {
            throw new IllegalArgumentException("Tipo de pago no soportado");
        }
    }
}
