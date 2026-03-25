package org.checkout.patterns._01_solid.ocp;

public class PaymentType {
    public static void main(String[] args) {
        PaymentMethod paypalPayment = new PayPalPayment();
        TransferPayment transferPayment = new TransferPayment();
        paypalPayment.pay();
        transferPayment.pay();
    }
}
