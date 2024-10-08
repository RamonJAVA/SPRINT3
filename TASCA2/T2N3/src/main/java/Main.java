public class Main {
    public static void main(String[] args) {
        PaymentGateway pg = new PaymentGateway();

        Payment payPalPayment = new PayPal("r@email.com", "*****");

        Payment cardPayment = new CreditCard("R",
                1234567890,
                "01/01/2222",
                123);

        Payment bankPayment = new BankAccount("1234567890",
                "Banco MoneyBucks",
                "R");


        pg.paymentProcessing(payPalPayment, 50);
        pg.paymentProcessing(cardPayment, 100);
        pg.paymentProcessing(bankPayment, 200);
    }
}
