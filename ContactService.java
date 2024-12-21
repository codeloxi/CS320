/**
 * Jacob Bennett
 * CS 320
 * 14 December 2024
 */
package Contact;
import java.util.ArrayList;
import java.util.List;


public class ContactService {

	public ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	/**
	 * addcontact method, Allows you to add a contact with all required information
	 * @param firstName
	 * @param lastName
	 * @param Number
	 * @param Address
	 */
	public void addContact(String firstName, String lastName, String Number, String Address) {
		Contact localContact = new Contact(firstName, lastName, Number, Address);
		contactList.add(localContact);
		
	}
	
	/**
	 * deletes contact
	 * @param ID takes in string id of the contact
	 */
	public void deleteContact(String ID) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.remove(i);
			}
			if( i == contactList.size() - 1) {
				throw new IllegalArgumentException("Contact ID: " + ID + " does not exist.");
			}
		}
	}
	
	/**
	 * Updates the first name in the contact
	 * @param ID
	 * @param firstName
	 */
	public void updateFirstName(String ID, String firstName) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setfirstName(firstName);
			}
			if( i == contactList.size() -1) {
				throw new IllegalArgumentException("Contact ID: " + ID + " does not exist.");
			}
		}
	}
	
	/**
	 * Updates last name in the contact
	 * @param ID
	 * @param lastName
	 */
	public void updateLastName(String ID, String lastName) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setlastName(lastName);
			}
			if( i == contactList.size() -1) {
				throw new IllegalArgumentException("Contact ID: " + ID + " does not exist.");
			}
		}
	}
	
	/**
	 * Updates the phone number
	 * @param ID
	 * @param num
	 */
	public void updateNumber(String ID, String num) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setNumber(num);
			}
			if( i == contactList.size() -1) {
				throw new IllegalArgumentException("Contact ID: " + ID + " does not exist.");
			}
		}
	}
	
	/**
	 * Updates the address in the contact
	 * @param ID
	 * @param Addr
	 */
	public void updateAddress(String ID, String Addr) {
		for(int i = 0; i < contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setAddress(Addr);
			}
			if( i == contactList.size() -1) {
				throw new IllegalArgumentException("Contact ID: " + ID + " does not exist.");
			}
		}
	}
	
	public List<Contact> getcontactList(){
		return contactList;
	}
	
	
}
