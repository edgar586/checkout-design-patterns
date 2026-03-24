package org.checkout.patterns._00_smell_antipatrones;

public class _002_ShippingByType {
    public double calculate(String shippingType) {
        switch (shippingType) {
            case "STANDARD":
                return 50.0;
            case "EXPRESS":
                return 120.0;
            case "SAME_DAY":
                return 200.0;
            default:
                throw new IllegalArgumentException("Tipo de envío inválido");
        }
    }
}
