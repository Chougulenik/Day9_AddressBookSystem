package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
		System.out.println("----------------------------------");
		AddNewContact contact = new AddNewContact();
		contact.addContact();
		//contact.editContact();
		System.out.println(contact.person);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
        int option = input.nextInt();

        //using switch case statement

        switch (option) {
            case 1:
                contact.editContact();
                System.out.println("You have Entered following data");
                System.out.println(contact.person);
                System.out.println("Thank you for Using the Address book");
                break;

            case 2:
                contact.deleteContact();
                System.out.println("Address Book details :" + contact.person);
                break;
        }
	}
}	

class ContactDetails {
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private int zip;
	private int phoneNumber;
	private String email;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public int getZip() {
		return zip;
	}
	
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "FirstName = " + firstName + "\nLastName = " + lastName + "\nAddress = " + address
				+ "\nCity = " + city + "\nState = " + state + "\nZip = " + zip + "\nPhoneNumber = "+ phoneNumber + "\nEmail = "
				+ email;
	}		        
}

class AddNewContact {
	Scanner input = new Scanner(System.in);
	ContactDetails person = new ContactDetails();
		
	public void addContact() {
		
		System.out.println("Enter First Name");
		String firstName = input.nextLine();	
		System.out.println("Enter Last Name");
		String lastName = input.nextLine();	
		System.out.println("Enter  Address");
		String address = input.nextLine();	
		System.out.println("Enter City Name");
		String city = input.nextLine();	
		System.out.println("Enter State");
		String state = input.nextLine();
		System.out.println("Enter Zip Code");
		int zip = input.nextInt();	
		System.out.println("Enter Phone Number");
		int phoneNumber = input.nextInt();	
		System.out.println("Enter Email Address");
		String email = input.next();	
		
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setZip(zip);
		person.setPhoneNumber(phoneNumber);
		person.setEmail(email);
		
		System.out.println("The Contact Details of " + firstName + "\n" + person);
	}
	
	public void editContact() {
		System.out.println("Enter First Name");
		String editname = input.nextLine();
		if(editname.equalsIgnoreCase(person.getFirstName()))
			addContact();
		else
			System.out.println("Enter name is not match");
		editContact();	
	}
	
	public void deleteContact() {
		System.out.println("Enter First Name");
		String editname = input.nextLine();
		if(editname.equalsIgnoreCase(person.getFirstName()))
			person = null;	
	}
		
}
	

