package Phone;

public class UKPhone implements Phone{
    private String phoneNumber;
    private final String PREFIX = "0044";

    public UKPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String prefixedPhone() {
        return(PREFIX + phoneNumber);
    }

    @Override
    public String toString() {
        return prefixedPhone();
    }
}