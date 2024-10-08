package Contact;

import Address.Address;
import Phone.Phone;

public interface ContactFactory {
    Address createAddress();
    Phone createPhone();
    Contact createContact(String name, Phone phone, Address address);
}
