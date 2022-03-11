package com.bridgelabz;

import java.util.Scanner;

public class AddressBookSystem {
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book System");
		System.out.println("----------------------------------");
		AddNewContact contact = new AddNewContact();
		contact.addContact();
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
	
	public void addContact() {
		ContactDetails contact = new ContactDetails();
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
		
		contact.setFirstName(firstName);
		contact.setLastName(lastName);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZip(zip);
		contact.setPhoneNumber(phoneNumber);
		contact.setEmail(email);
		
		System.out.println("The Contact Details of " + firstName + "\n" + contact);
	}
}
