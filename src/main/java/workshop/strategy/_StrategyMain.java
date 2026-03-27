package workshop.strategy;

import workshop.model.Order;

public class _StrategyMain {
    public static void main(String[] args) {
        double originalAMount = 200.0;
        DiscountStrategy noDiscout = new NoDiscount();
        Order order = new Order(noDiscout, originalAMount);
        System.out.println(noDiscout.getDescription());

        //15% de descuento
        DiscountStrategy percentDiscount = new PercentageDiscount(15);
        Order orden2 = new Order(percentDiscount,originalAMount);
        System.out.println(percentDiscount.getDescription());

    }
}
