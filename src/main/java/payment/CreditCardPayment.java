package payment;

public class CreditCardPayment implements PaymentStrategy {

    public PaymentResult processPayment(PaymentRequest paymentRequest) {
        // In a real application, you would integrate with a payment gateway here
        System.out.println("Processing credit card payment for order: " + paymentRequest.getOrderId());
        System.out.println("Amount: " + paymentRequest.getAmount());
        System.out.println("Card details: " + paymentRequest.getPaymentMethodDetails());

        PaymentResult result = new PaymentResult();
        result.setSuccess(true);
        result.setTransactionId("CC-" + System.currentTimeMillis());
        result.setMessage("Credit card payment processed successfully");
        return result;
    }
}

