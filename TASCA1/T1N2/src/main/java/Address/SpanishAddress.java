package Address;

public class SpanishAddress implements Address {
    private String street;
    private int streetNumber;
    private String city;
    private String zip;
    private final String COUNTRY = "Spain";

    public SpanishAddress(String street, int streetNumber, String city, String zip) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String fullAdress() {
       return("C/ " + this.street + ", " + this.streetNumber + ", "
                + this.zip + ", " + this.city + ", " + COUNTRY + ".");
    }

    @Override
    public String toString() {
        return fullAdress();
    }
}
