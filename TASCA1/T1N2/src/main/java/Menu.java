import java.util.ArrayList;
import java.util.Scanner;

import Contact.Contact;
import Contact.ContactFactory;
import Contact.SpanishContact;
import Contact.UKContact;
import Phone.Phone;
import Address.Address;

public class Menu {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Contact> contacts = new ArrayList<>();

    public static void start() {

        boolean exit = false;

        do{
            switch(menu()){
                case 1: createContact();
                    break;
                case 2: showContacts();
                    break;
                case 0: System.out.println("Goodbye!");
                    exit = true;
                    break;
            }
        }while(!exit);
    }

    public static byte menu(){

        byte option;
        final byte MIN = 0;
        final byte MAX = 2;

        do{
            System.out.println("Contact List");
            System.out.println("1. Create contact.");
            System.out.println("2. Show all contacts.");
            System.out.println("0. Exit.\n");
            option = sc.nextByte();
            sc.nextLine();

            if(option < MIN || option > MAX){
                System.err.println("Escoge una opción válida.");
            }

        } while(option < MIN || option > MAX);

        return option;
    }

    public static void createContact(){

        System.out.println("Choose the country:");
        System.out.println("1. Spain.");
        System.out.println("2. UK.");
        int option = sc.nextInt();
        sc.nextLine();

        switch (option){

            case 1:
                createContact(new SpanishContact());
                break;

            case 2:
                createContact(new UKContact());
                break;
        }
    }
    public static void createContact(ContactFactory factory){

        System.out.println("Name:");
        String name = sc.nextLine();
        Address address = factory.createAddress();
        Phone phone = factory.createPhone();

        Contact contact = factory.createContact(name, phone, address);
        contacts.add(contact);

        System.out.println("Name: " + name);
        System.out.println("Address: " + address.fullAdress());
        System.out.println("Phone: " + phone.prefixedPhone());
        System.out.println("Contact added to list.");
    }

    public static void showContacts(){

        if(contacts.isEmpty()){
            System.err.println("Empty contact list.");

        } else {
            contacts.forEach(System.out::println);
        }
    }

}