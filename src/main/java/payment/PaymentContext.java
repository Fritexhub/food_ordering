
package payment;

import java.util.Map;
import java.util.Optional;


public class PaymentContext {
    private final Map<String, PaymentStrategy> paymentStrategies;

    public PaymentContext(Map<String, PaymentStrategy> paymentStrategies) {
        this.paymentStrategies = paymentStrategies;
    }

    public PaymentResult executePayment(String paymentMethod, PaymentRequest paymentRequest) {
        return Optional.ofNullable(paymentStrategies.get(paymentMethod + "PaymentStrategy"))
                .orElseThrow(() -> new IllegalArgumentException("Invalid payment method: " + paymentMethod))
                .processPayment(paymentRequest);
    }
}