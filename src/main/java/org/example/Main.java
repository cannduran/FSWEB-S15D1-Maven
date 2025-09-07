package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MobilePhone mobilePhone = new MobilePhone("023423423", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("emrah","42342342" ));
        mobilePhone.addNewContact(new Contact("mehmet","42342342" ));
        mobilePhone.addNewContact(new Contact("selim","42342342" ));
        mobilePhone.addNewContact(new Contact("emrah","42342342" ));
        mobilePhone.addNewContact(new Contact("emrah","42342342" ));
        mobilePhone.printContacts();
    }
}
