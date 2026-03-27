package workshop.strategy;

public class PercentageDiscount implements DiscountStrategy {
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount * (1 - percentage/100);
    }

    @Override
    public String getDescription() {
        return String.format("%.2f%% Descuento", percentage);
    }
}
