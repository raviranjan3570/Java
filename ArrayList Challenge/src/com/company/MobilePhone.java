package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private ArrayList<Contacts> contact;
    private String myNumber;

    public MobilePhone(String myNumber){

        this.myNumber = myNumber;
        this.contact = new ArrayList<>();
    }

    public boolean addContact(Contacts contacts){

        if(findContact(contacts.getName()) >= 0){

            System.out.println("Contact is already on file");
            return false;
        }
        contact.add(contacts);
        return true;
    }

    public boolean modifyContact(Contacts oldContact, Contacts newContact){

        int position = findContact(oldContact);
        if(position < 0){

            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        else if(findContact(newContact.getName()) != -1){

            System.out.println("Contact with name" + newContact.getName() + " already exists. Update was not successful.");
        }

        this.contact.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contacts contacts){

        int position = findContact(contacts);
        if(position < 0){

            System.out.println(contacts.getName() + ", was not found.");
            return false;
        }

        this.contact.remove(position);
        System.out.println(contacts.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contacts contacts){

        return this.contact.indexOf(contacts);
    }

    private int findContact(String contactName){

        for (int i = 0; i < contact.size(); i++){

            Contacts contacts = this.contact.get(i);
            if(contacts.getName().equals(contactName)){

                return i;
            }
        }

        return -1;
    }

    public Contacts queryContact(String name){

        int position = findContact(name);
        if(position >= 0){
            return this.contact.get(position);
        }
        return null;
    }

    public void printContacts(){

        System.out.println("Contact list");
        for(int i = 0; i < this.contact.size(); i++){

            System.out.println((i+1) + "." +
                    this.contact.get(i).getName() + " ->" +
                    this.contact.get(i).getPhoneNumber());
        }
    }
}
