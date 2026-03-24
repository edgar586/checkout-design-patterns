package org.checkout.patterns._01_solid.dip;

public class StripePaymentService implements PaymentService {
    public void pay() {
        System.out.println("Pagando con Stripe");
    }
}
