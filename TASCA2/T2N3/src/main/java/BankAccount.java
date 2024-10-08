public class BankAccount implements Payment{

    private String accountNumber;
    private String bankCompany;
    private String accountHolder;

    public BankAccount(String accountNumber, String bankCompany, String accountName) {
        this.accountNumber = accountNumber;
        this.bankCompany = bankCompany;
        this.accountHolder = accountName;
    }


    @Override
    public void transaction(double price) {
        System.out.println("Payed with Bank Account transfer.");
    }
}
