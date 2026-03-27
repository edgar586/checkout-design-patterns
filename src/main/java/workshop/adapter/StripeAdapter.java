package workshop.adapter;

import java.util.Map;

public class StripeAdapter implements PaymentGateway {
    private final StripeSDK stripeSDK;
    private final String merchantId;

    public StripeAdapter(StripeSDK stripeSDK, String merchantId) {
        this.stripeSDK = stripeSDK;
        this.merchantId = merchantId;
    }

    @Override
    public boolean change(String orderId, double amount) {
        //Adaptar centavos a Dolares
        int amountInCents = (int)(amount * 100);
        Map<String, Object> response = stripeSDK.createCharge(merchantId,amountInCents, "USD");
        String status = response.get("status").toString();
        boolean success = "succeeded".equals(status);
        System.out.printf("  [Adapter] Stripe response: %s → %s%n",status, success ? "OK" : "FAIL");
        return success;
    }

    @Override
    public String getGatewayName() {
        return "Via adaptador";
    }
}
