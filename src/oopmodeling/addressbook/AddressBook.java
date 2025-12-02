package oopmodeling.addressbook;
/**
 * This class is in charge of the administration of 
 * a group of contacts
 * @author alex
 * 26 nov 2025
 */


import java.util.Iterator;
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
		for (int i = 0; i < contactsArray.size(); i++) {
			System.out.println(contactsArray.get(i).toString());
		}
	}
	
	public void addContact(Contact contact) {
		contactsArray.add(contact);
	}
	
	public boolean removeContact(String name) {
		//1 a loop to find the position of the contact
		//Contact[] eles = contactsArray.getAll();
		for (int i = 0; i < contactsArray.size(); i++) {
			if (contactsArray.get(i).getName().equals(name)) {
				contactsArray.remove(i);
				return true;
			}
			
		}
		//2 remove the contact by its position in the array		
		
		return false;
	}

}
