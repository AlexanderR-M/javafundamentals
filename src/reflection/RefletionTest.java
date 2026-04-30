package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import oopmodeling.addressbook.AddressBook;

public class RefletionTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Class<AddressBook> cls1 = AddressBook.class;
		Class<AddressBook> cls2 = 
				(Class<AddressBook>) new AddressBook().getClass();
		Class<?> cl3 = 
				Class.forName("oopmodeling.addressbook.AddressBook");
		inspectClass(cls1);
		
		AddressBook addressBook = new AddressBook();
		manipulateObject(addressBook);
		
		invokeMethodsOfAnObject(addressBook);
	}
	
	private static void invokeMethodsOfAnObject(Object obj) {
		Class<?> cls1 = obj.getClass();
		try {
			Method method = cls1.getDeclaredMethod("getName");
			method.invoke(obj, null);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void manipulateObject(AddressBook addressBook) throws IllegalArgumentException, IllegalAccessException {
		Class<?> cls1 = addressBook.getClass();
		
		Field[] fields = cls1.getDeclaredFields();
		try {
			Field field = cls1.getDeclaredField("phoneNumber");
			System.out.println(addressBook.getContact());
			field.setAccessible(true);
			//read the value of a specified field
			field.get(addressBook);
			
			//modify the value of a field of the object
			field.set(addressBook, "22222");
		} catch (NoSuchFieldError e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		cls1.getDeclaredFields();
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
