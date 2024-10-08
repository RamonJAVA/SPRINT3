package Contact;

import Address.Address;
import Address.UKAddress;
import Phone.Phone;
import Phone.UKPhone;

import java.util.Scanner;

public class UKContact implements ContactFactory{
    Scanner sc = new Scanner(System.in);

    @Override
    public Address createAddress() {
        System.out.println("Name of the street:");
        String street = sc.next();
        System.out.println("Number:");
        int streetNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Zip code:");
        String zip = sc.next();
        System.out.println("City:");
        String city = sc.next();

        return new UKAddress(street, streetNumber, zip, city);
    }

    @Override
    public Phone createPhone() {
        System.out.println("Phone number:");
        String phoneNumber = sc.next();

        return new UKPhone(phoneNumber);
    }

    @Override
    public Contact createContact(String name, Phone phone, Address address) {
        Contact contact = new Contact(name, phone, address);
        return contact;
    }
}