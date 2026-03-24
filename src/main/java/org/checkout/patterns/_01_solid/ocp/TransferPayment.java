package org.checkout.patterns._01_solid.ocp;

public class TransferPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Pago con transferencia");
    }
}
