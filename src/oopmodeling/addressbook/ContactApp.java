package oopmodeling.addressbook;

import java.util.Scanner;

/**
 * 
 * @author alex
 * 26 nov 2025
 */

public class ContactApp {
	
	final static AddressBook addressBook = new AddressBook();
	final static Scanner scanner = new Scanner(System.in);
	

	
	public static void main(String[] args) {
		byte option = 2;
		
		while (true) {
			showMenu();
			option = scanner.nextByte();
			System.out.println(option);
			
			
			
			if (option == 4) {
				System.out.println("Has salido de la ContactApp");
				break;
				
			}
			else if (option == 1) {
				
				addContact();
				
			}
			
		}
		
		
		
		
		//addressBook.showContacts();
		//addressBook.addContact(null);
		
	}


	private static void addContact() {
		System.out.println("------Add contact to your address book-----");
		//1 the user introduce the number, name and other information about the contact
		System.out.println("Please enter the contatcs name");
		String name = scanner.nextLine();
		
		System.out.println("Please enter the contatcs surname");
		String surname = scanner.nextLine();
		
		System.out.println("Please enter the contatcs phone");
		String phone = scanner.nextLine();
		
		System.out.println("Please enter the contatcs name");
		String  location= scanner.nextLine();
		//2 Create an object of "Contact", encapsulating all the data passed in the first step
		
		//3 Add the new object to the contact array
		
	}


	private static void showMenu() {
		System.out.println("1, Add contact");
		System.out.println("2, Show contact");
		System.out.println("3, Remove contact");
		System.out.println("4, Exit");
	}

}
