package com.exam;

import com.exam.model.Contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManagement contactManagement = new ContactManagement();

        int choose = 0;
        Scanner input = new Scanner(System.in);

        try {
            do {
                System.out.println("1. Add new contact");
                System.out.println("2. Find a contact by name");
                System.out.println("3. Display contacts");
                System.out.println("4. Exit");
                System.out.println("Chosen Menu");
                choose = input.nextInt();

                switch (choose) {
                    case 1: {
                        Contact contact = new Contact();
                        contact.inputData();
                        contactManagement.addNewContact(contact);
                    }
                    break;
                    case 2: {
                        System.out.println("Enter Name:");
                        input.nextLine();
                        String name = input.nextLine();
                        Contact contact2=contactManagement.findContactByName(name);
                        if( contact2 != null) {
                            System.out.println("Found");
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    break;
                    case 3: {
                        contactManagement.displayAll();
                    }
                    break;
                    case 4: {
                        return;
                    }
                }
            } while(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
