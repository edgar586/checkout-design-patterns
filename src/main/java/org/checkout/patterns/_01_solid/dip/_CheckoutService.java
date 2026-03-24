package org.checkout.patterns._01_solid.dip;

public class _CheckoutService {
    public _StripePaymentService paymentService = new _StripePaymentService();

    public void checkout() {
        paymentService.pay();
    }
}
