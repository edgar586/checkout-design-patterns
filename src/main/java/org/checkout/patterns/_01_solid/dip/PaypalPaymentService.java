package org.checkout.patterns._01_solid.dip;

public class PaypalPaymentService implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Pagando con Paypal");
    }
}
