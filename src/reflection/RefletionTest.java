package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import oopmodeling.addressbook.AddressBook;

public class RefletionTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<AddressBook> cls1 = AddressBook.class;
		Class<AddressBook> cls2 = 
				(Class<AddressBook>) new AddressBook().getClass();
		Class<?> cl3 = 
				Class.forName("oopmodeling.addressbook.AddressBook");
		inspectClass(cls1);
		
	}

	private static void inspectClass(Class<AddressBook> cls1) {
		cls1.getDeclaredConstructors();
		Method[] ms = cls1.getDeclaredMethods();
		for (int i = 0; i < ms.length; i++) {
			System.out.println("method name is " + ms[i].getName());
	       
	        java.lang.reflect.Parameter[] parameters = ms[i].getParameters();
	        
	        for (java.lang.reflect.Parameter param : parameters) {
	            System.out.println("  parameter name is " + param.getName());
	            System.out.println("  parameter type is " + param.getType());
	        }
		}
		
		for (Field field : cls1.getDeclaredFields()) {
			System.out.println("field name is "+ field.getName());
			System.out.println("field type is "+ field.getType());
		}
		
		for (Annotation annotation : cls1.getAnnotations()) {
			System.out.println("annottation type is "+ annotation.annotationType());
	
		}
		
		
		
	}

}
