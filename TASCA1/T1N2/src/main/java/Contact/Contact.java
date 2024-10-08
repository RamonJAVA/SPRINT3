package Contact;

import Phone.Phone;
import Address.Address;

public class Contact {
    private String name;
    private Phone phone;
    private Address address;

    public Contact(String name, Phone phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public void getFullAddress(){
        address.fullAdress();
    }

    public void prefixedPhone(){
        phone.prefixedPhone();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                ", address=" + address +
                '}';
    }
}
