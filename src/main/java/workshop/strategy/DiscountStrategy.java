package workshop.strategy;

public interface DiscountStrategy {
    double applyDiscount(double amount);
    String getDescription();
}
