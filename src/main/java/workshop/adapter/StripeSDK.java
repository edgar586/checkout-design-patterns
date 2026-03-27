package workshop.adapter;

import java.util.HashMap;
import java.util.Map;

public class StripeSDK {
    public Map<String, Object> createCharge(String merchantId, int amountInCents, String currency) {
        System.out.printf("  [Stripe SDK] createCharge(merchant=%s, cents=%d, currency=%s)%n",
                merchantId, amountInCents, currency);

        // Simular respuesta del SDK
        Map<String, Object> response = new HashMap<>();
        response.put("id", "ch_" + System.currentTimeMillis());
        response.put("status", "succeeded");
        response.put("amount", amountInCents);
        return response;
    }
}
