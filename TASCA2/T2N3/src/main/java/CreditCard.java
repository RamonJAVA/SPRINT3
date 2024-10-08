public class CreditCard implements Payment{

    private String name;
    private int cardNum;
    private String expDate;
    private int code;

    public CreditCard(String name, int cardNum, String expDate, int code) {
        this.name = name;
        this.cardNum = cardNum;
        this.expDate = expDate;
        this.code = code;
    }


    @Override
    public void transaction(double price) {
        System.out.println("Payed with Credit Card.");
    }
}
