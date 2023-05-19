package com.exam;

import com.exam.model.Contact;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManagement {
    List<Contact> list;


    public ContactManagement() {
        list = new ArrayList<Contact>();
    }

    public void addNewContact(Contact contact) throws Exception{

        list.add(contact);
    }
    Contact findContactByName( String name) {
        for (Contact item : list) {
            if (name.equals(item.getName())) {
                item.displayAll();
                return item;
            }
        }
        return null;
    }
    public void displayAll() {
        for (Contact item : list) {
            item.displayAll();
        }
    }
}
