package oopmodeling.addressbook;

/**
 * 
 * @author alex
 * 26 nov 2025
 */

public class ContactApp {
	
	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		
		addressBook.showContacts();
		addressBook.addContact(null);
		
	}

}
