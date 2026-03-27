package workshop.strategy;

public class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {
        return amount;
    }

    @Override
    public String getDescription() {
        return "Sin descuento";
    }
}
