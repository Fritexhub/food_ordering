package payment;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public PaymentResult processPayment(PaymentRequest paymentRequest) {
        System.out.println("Processing PayPal payment for order: " + paymentRequest.getOrderId());
        System.out.println("Amount: " + paymentRequest.getAmount());
        System.out.println("PayPal email: " + paymentRequest.getPaymentMethodDetails());

        PaymentResult result = new PaymentResult();
        result.setSuccess(true);
        result.setTransactionId("PP-" + System.currentTimeMillis());
        result.setMessage("PayPal payment processed successfully");
        return result;
    }
}
