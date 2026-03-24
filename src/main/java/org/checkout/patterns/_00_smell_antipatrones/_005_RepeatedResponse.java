package org.checkout.patterns._00_smell_antipatrones;

public class _005_RepeatedResponse {
}
class PaymentController {
    public String successResponse() {
        return "{ \"status\": \"OK\", \"message\": \"Operación exitosa\" }";
    }
}

class OrderController {
    public String successResponse() {
        return "{ \"status\": \"OK\", \"message\": \"Operación exitosa\" }";
    }
}

class CustomerController {
    public String successResponse() {
        return "{ \"status\": \"OK\", \"message\": \"Operación exitosa\" }";
    }
}