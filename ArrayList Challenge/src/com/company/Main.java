package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private  static MobilePhone mobilePhone = new MobilePhone("9504826259");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){

            System.out.println("Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){

                case 0:
                    System.out.println("\n shutting down...");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void addNewContact(){

        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contacts contacts = Contacts.createContacts(name, phoneNumber);
        if(mobilePhone.addContact(contacts)){

            System.out.println("New contact added: name = " + name + ", number = " + phoneNumber);
        }

        else{
            System.out.println("Cannot add, " + name + " already on file.");
        }
    }

    private static void updateContact(){

        System.out.println("Enter existing contact.");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new Contact: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        Contacts newContact = Contacts.createContacts(newName, newNumber);
        if(mobilePhone.modifyContact(existingContactRecord, newContact)){

            System.out.println("successfully updated record.");
        }

        else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {

        System.out.println("Enter existing contact.");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){

            System.out.println("Successfully deleted");
        }

        else{

            System.out.println("Error deleting");
        }
    }

    private static void queryContact() {

        System.out.println("Enter existing contact: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("name: " + existingContactRecord.getName() + ", phone number is: " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting Phone...");
    }

    private static void printActions(){

        System.out.println("Available action: \npress");
        System.out.println("0 - to shut down\n" +
                "1 - to print contacts\n" +
                "2 - to add a new contact\n" +
                "3 - to update an existing contacts\n" +
                "4 - to remove a existing contact\n" +
                "5 - to query if an existing contact exists\n" +
                "7 - to print a list of existing actions");
        System.out.println("chose your action: ");
    }
}
