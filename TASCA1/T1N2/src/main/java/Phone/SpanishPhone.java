package Phone;

public class SpanishPhone implements Phone{
    private String phoneNumber;
    private final String PREFIX = "0034";

    public SpanishPhone(String phoneNumber) {
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
