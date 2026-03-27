package workshop.adapter;

public class _AdapterMain {
    public static void main(String[] args) {
        StripeAdapter stripeAdapter = new StripeAdapter(new StripeSDK(), "comerciante 123");
        stripeAdapter.change("oder_767", 99.99);
        stripeAdapter.getGatewayName();
    }
}
