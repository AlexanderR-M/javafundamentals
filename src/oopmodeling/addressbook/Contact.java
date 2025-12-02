package oopmodeling.addressbook;

public class Contact {
	
	/**
	 * constructor used to create objects of this class and assign values 
	 * to this type of objects ' fields
	 * @param name
	 * @param surname
	 * @param phone
	 * @param location
	 */
	
	//Attributes or fields of the class
	
	public Contact(String name, String surname, String phone, String location) {
		// TODO Auto-generated constructor stub
		this.phone = phone;
		this.name = name;
		this.location =location;
		this.surname = surname;
	}
	//Atributes or fields class
	private String phone;
	private String name;
	private String surname;
	private String location;
	
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return "name: " + name + "phone number" + phone;
	}

}
