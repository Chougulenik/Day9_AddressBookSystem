package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class OperatorContact {
	 HashMap<String, AddressBook> contactMap = new HashMap<>();  // using hashmap to store multiple contacts
	 public void editContact(ArrayList<AddressBook> contactArray) {

	        String address;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nEnter the First name for update Address : ");
	        String editName = sc.nextLine();
	        int flag = 1;
	        Iterator itr = contactArray.iterator();
	        while (itr.hasNext()) {
	            AddressBook contactObject = (AddressBook) itr.next();
	            if (editName.equals(contactObject.getFirstName())) {
	                System.out.print("\nEnter your new Address : ");
	                address = sc.nextLine();
	                contactObject.setAddress(address);
	                flag = 0;
	            }
	        }
	        if (flag == 1) {
	            System.out.print("\ncouldn't find the contact..");
	        }
	        sc.close();
	    }

	    public ArrayList<AddressBook> deleteContact(ArrayList<AddressBook> contactArr) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nEnter the First name for delete : ");
	        String deleteName = sc.nextLine();
	        int flag = 1;
	        Iterator itr = contactArr.iterator();
	        while (itr.hasNext()) {
	            AddressBook contactObject = (AddressBook) itr.next();
	            if (deleteName.equals(contactObject.getFirstName())) {
	                contactArr.remove(contactObject);
	                flag = 0;
	            }
	        }
	        if (flag == 1) {
	            System.out.print("\ncouldn't find the contact..");
	        } else {
	            System.out.print("\nYour contact deleted..");
	        }
	        sc.close();
	        return contactArr;
	    }

	    public void showContact(ArrayList<AddressBook> contactArr) {

	        Iterator itr = contactArr.iterator();
	        while (itr.hasNext()) {
	            AddressBook contactObject = (AddressBook) itr.next();
	            System.out.print("\n-----------------");
	            System.out.print("\nFirst Name  : " + contactObject.getFirstName());
	            System.out.print("\nLast Name   : " + contactObject.getLastName());
	            System.out.print("\nAddress     : " + contactObject.getAddress());
	            System.out.print("\nCity        : " + contactObject.getCity());
	            System.out.print("\nState       : " + contactObject.getState());
	            System.out.print("\nPone Number : " + contactObject.getPhoneNo());
	            System.out.print("\nE-mail      : " + contactObject.getEmail());
	            System.out.print("\nZip         : " + contactObject.getZip());
	        }
	    }
	    
	    public void storeContact(String firstName, AddressBook contact) {

	        this.contactMap.put(firstName, contact);
	    }    

}
	    
