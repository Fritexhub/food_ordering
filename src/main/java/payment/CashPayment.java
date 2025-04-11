package payment;

public class CashPayment implements PaymentStrategy {
    public PaymentResult processPayment(PaymentRequest paymentRequest) {
        System.out.println("Processing Cash on Delivery for order: " + paymentRequest.getOrderId());
        System.out.println("Amount to be collected: " + paymentRequest.getAmount());

        PaymentResult result = new PaymentResult();
        result.setSuccess(true); // Assuming the order is accepted
        result.setTransactionId("COD-" + System.currentTimeMillis());
        result.setMessage("Order will be delivered. Please pay in cash upon delivery");
        return result;
    }
}
