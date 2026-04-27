package reflection;

import oopmodeling.addressbook.AddressBook;

public class RefletionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<AddressBook> cls = AddressBook.class;
		Class<AddressBook> cls2 = 
				(Class<AddressBook>) new AddressBook().getClass();
		Class<?> cl3 = 
				Class.forName("oopmodeling.addressbook.AddressBook");
		
	}

}
