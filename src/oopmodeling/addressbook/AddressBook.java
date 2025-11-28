package oopmodeling.addressbook;
/**
 * This class is in charge of the administration of 
 * a group of contacts
 * @author alex
 * 26 nov 2025
 */


import java.util.Scanner;

import datastructure.FlexibleArray;

public class AddressBook {
	
	//Attributes
	protected FlexibleArray<Contact> contactsArray ;
	
	public AddressBook() {
	
		contactsArray = new FlexibleArray<Contact>();
	}
	
	
	protected Scanner scanner;
	
	
	
	//behaves
	public void showContacts() {
		
	}
	
	public void addContact(Contact contact) {
		contactsArray.add(contact);
	}
	
	public void removeContact(Contact contact) {
		contactsArray.remove(contact);
	}

}
