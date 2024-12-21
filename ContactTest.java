/**
 * Jacob Bennett
 * CS 320
 * 14 December 2024
 */
package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

import Contact.Contact;

import org.junit.jupiter.api.Test;

class ContactTest {

	@DisplayName("Test Constructor")
	@Test
	void testConstructor() {
		String fname = "first", lname = "last", num = "9999999999", add = "address";
		
		Contact contact = new Contact(fname, lname, num, add);
		
		//assertEquals(, contact.getContactID());
		assertEquals(fname, contact.getfirstName());
		assertEquals(lname, contact.getlastName());
		assertEquals(num, contact.getNumber());
		assertEquals(add, contact.getAddress());
	}
	
	@DisplayName("Test first name")
	@Test
	void firstname() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		if (contact.getfirstName() == null || contact.getfirstName().length() > 10) {
			fail("Fail first name");
		}
		
	
	}
	
	@DisplayName("Test first name2")
	@Test
	void firstNameNull() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setfirstName(null);
		if (contact.getfirstName() == null) {
			fail("null");
		}
	}
	
	@DisplayName("Test first name3")
	@Test
	void firstNameLength() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setfirstName("Waytoooooooasfklasfklasjfkla;sjkflasjfkl;asjfkl;sadjf;lkdfjlksdfj");
		if (contact.getfirstName().length() > 10) {
			fail ("too long");
		}
	}
	
	
	@DisplayName("Test last name")
	@Test
	void lastname() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		if (contact.getlastName() == null || contact.getlastName().length() > 10) {
			fail("Fail last name");
		}
		
	}
	
	@DisplayName("Test last name2")
	@Test
	void lastnamenull() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setlastName(null);
		if (contact.getlastName() == null) {
			fail("fail last name");
		}
	}
	
	@DisplayName("Test last name3")
	@Test
	void lastnameLength() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setlastName("askdjfasjkflajsklfjkla;sjfkl;asdjfklasdjfklasjflkas;fjas");
		if (contact.getlastName().length() > 10) {
			fail("fail last name");
		}
	}
	
	@DisplayName("Test Number")
	@Test
	void numTest() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		if (contact.getNumber() == null || contact.getNumber().length() > 10) {
			fail("Fail number");
		}
		
		
		
	}
	
	@DisplayName("Test Number2")
	@Test
	void numTestNull(){
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setNumber(null);
		if (contact.getNumber() == null) {
			fail("null number");
		}
	}
	
	@DisplayName("Test Number3")
	@Test
	void numTestLength(){
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setNumber("99999999999999999999999999999999999999");
		if (contact.getNumber().length() > 10) {
			fail("too long number");
		}
	}
	
	@DisplayName("Test address")
	@Test
	void address() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		if (contact.getAddress() == null || contact.getAddress().length() > 50) {
			fail("Fail Address");
		}
		
		
	}
	
	@DisplayName("Test address2")
	@Test
	void addressNull() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setAddress(null);
		if (contact.getAddress() == null) {
			fail("null address");
		}
	}
	
	@DisplayName("Test address3")
	@Test
	void addresslength() {
		Contact contact = new Contact("First", "Last", "9999999999", "address");
		contact.setAddress("lkasjkldfasklfjaklsfjklasdjfklasjfkoasdjfklasjfklsadjfaklsdjfklasdjfklasdjfklasdjfaklsjfaslkfjasjflks;jfsadflkasjfkl;sajfkal;sjfkslfjklsadjfk");
		if (contact.getAddress().length() > 30) {
			fail("Too long address");
		}
	}
	
	
}
