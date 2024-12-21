/**
 * Jacob Bennett
 * CS 320
 * 14 December 2024
 */
package Contact;

import java.util.concurrent.atomic.LongAdder;

public class Contact {

	private String contactID = "0";
	private String firstName = "first";
	private String lastName = "last";
	private String Number = "9999999999";
	private String Address = "address";
	private static LongAdder newID = new LongAdder();
	
	
	public Contact(String firstName, String lastName, String Number, String Address) {
		
		//increment and set contactID to unique ID each time constructor is called. Also utilize setter function 
		newID.increment();
		//contactID = newID.toString();
		setContactID(newID.toString());
		setfirstName(firstName);
		setlastName(lastName);
		setNumber(Number);
		setAddress(Address);
		
	}
	
	/**
	 * Setters
	 */
	
	public void setfirstName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("String cannot be empty");
		}
		else if (name.length() > 10) {
			throw new IllegalArgumentException("Name must be less than 10 characters");
		}
		else {
			this.firstName = name;
		}
	}
	
	public void setlastName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("String cannot be empty");
		}
		else if (name.length() > 10) {
			throw new IllegalArgumentException("Name must be less than 10 characters");
		}
		else {
			this.lastName = name;
		}
	}
	
	public void setNumber(String num) {
		String numCheck = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$"; 
		
		if(num == null) {
			throw new IllegalArgumentException("String cannot be empty");
		}
		else if (num.matches(numCheck)) {
			this.Number = num;
		}
	}
	
	public void setAddress(String add) {
		if (add == null) {
			throw new IllegalArgumentException("String cannot be empty");
		}
		else if (add.length() > 30) {
			throw new IllegalArgumentException("Address cannot be longer than 30 characters");
		}
	}
	
	protected void setContactID(String id) {
		if (id == null) {
			//throw new IllegalArgumentException("String cannot be empty");
		}
		else if (id.length() > 10 ) {
			//throw new IllegalArgumentException("ID cannot be longer than 10 characters");
		}
		else {
			this.contactID = id;
		}
	}
	
	/**
	 * Getters
	 */
	
	public String getContactID() {
		return contactID;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public String getNumber() {
		return Number;
	}
	
	public String getAddress() {
		return Address;
	}
	
}
