public class PayPal implements Payment{

    private String email;
    private String password;

    public PayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void transaction(double price) {
        System.out.println("Payed with PayPal.");
    }
}
