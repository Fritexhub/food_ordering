
package payment;


public interface PaymentStrategy {
    PaymentResult processPayment(PaymentRequest paymentRequest);


}