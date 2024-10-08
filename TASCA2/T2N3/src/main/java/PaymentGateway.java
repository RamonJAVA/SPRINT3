public class PaymentGateway {
    public void paymentProcessing(Payment paymentMethod, double price){
        paymentMethod.transaction(price);
        System.out.println("Payment of " + price + " processed.");
    }

}
