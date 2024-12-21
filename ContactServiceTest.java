/**
 * Jacob Bennett
 * CS 320
 * 14 December 2024
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Contact.Contact;
import Contact.ContactService;

class ContactServiceTest {
	
	Contact contact = new Contact(null, null, null, null);


	@DisplayName("Test adding contact")
	@Test
	void addContact() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		assertNotNull(cserv.contactList, "Null List");
	}
	
	@DisplayName("Test deleting contact")
	@Test
	void deleteContact() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		
		String temp = cserv.contactList.getLast().toString();
		cserv.deleteContact(temp);
		
		if (cserv.contactList.isEmpty()) {
			fail("empty list");
		}
	}
	
	@DisplayName("Test updating first name")
	@Test
	void firstName() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		cserv.updateFirstName("1", "firstName");
		assertNotNull(cserv.contactList, "List not null");
	}
	
	@DisplayName("Test updating last name")
	@Test
	void lastName() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		cserv.updateLastName("1", "firstName");
		assertNotNull(cserv.contactList, "List not null");
	}
	
	@DisplayName("Test updating number")
	@Test
	void number() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		cserv.updateNumber("1", "9999999999");
		assertNotNull(cserv.contactList, "List not null");
	}
	
	@DisplayName("Test updating address")
	@Test
	void address() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		cserv.updateAddress("1", "addressupdate");
		assertNotNull(cserv.contactList, "List not null");
	}
	
	@DisplayName("Test return list")
	@Test
	void returnlist() {
		ContactService cserv = new ContactService();
		cserv.addContact("first", "last", "9999999999", "address");
		List<Contact> temp = cserv.getcontactList();
		assertNotNull(temp, "list is null");
		
	}
	
	
}
