package workshop.factory;

public class _FactoryMain {
    public static void main(String[] args) {
        //Haremos uso de la fabrica para crear procesadores de pago
        PaymentProcessor processor = PaymentProcessorFactory.create("PAYPAL");
        //Procesar un pago
        double amount = 299.99;
        System.out.println("Iniciando proceso de pago con " + processor.getPaymentMethod());
        boolean success = processor.processPayment(amount);
        if(success) {
            System.out.println("Pago procesado exitosamente con " + processor.getPaymentMethod());
        } else {
            System.out.println("Error al procesar el pago con " + processor.getPaymentMethod());
        }
    }
}
