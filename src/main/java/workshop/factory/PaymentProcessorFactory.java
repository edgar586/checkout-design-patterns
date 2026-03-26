package workshop.factory;

public class PaymentProcessorFactory {

    public static PaymentProcessor create(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
            throw new IllegalArgumentException("paymentMethod no puede ser null o vacío");
        }
        switch (paymentMethod.toUpperCase()) {
            case "CREDIT_CARD":
                return new CreditCardProcessor();
            case "PAYPAL":
                return new PayPalPayment();
            default:
                throw new IllegalArgumentException("Método de pago no soportado: " + paymentMethod);
        }
    }

}
