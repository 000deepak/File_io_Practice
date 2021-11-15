/*
package addressBook;


import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookTest {
	AddressBook addressBook = new AddressBook();
	ArrayList<Contact> contact = new ArrayList<Contact>();

	@Test
	public void whenPersonDetails_Added_ShouldReturn_True() {
		Contact person2 = new Contact("pranav", "dani", "ddd", "pune", "Maharastra", "@gmail.com",
				8089987898L, 64011);
		contact.add(person2);
		System.out.println(contact.toString());
		boolean result = addressBook.addContact(contact);
		Assert.assertTrue(result);
	}
	
	@Test
	public void whenvalidNoOfPersonDetails_Added_ShouldReturn_false() {
		Contact person1= new Contact("bbb", "ccc", "ddd", "delhi", "Map", "@gmail.com",
				8089987898L, 64011);
		contact.add(person1);
		System.out.println(contact.toString());
		addressBook.addContact(contact);
 		Assert.assertEquals(1, contact.size());
	}

	@Test
	public void whenInvalidNoOfPersonDetails_Added_ShouldReturn_false() {
		Contact person1= new Contact("bbb", "ccc", "ddd", "delhi", "Map", "@gmail.com",
				8089987898L, 64011);
		contact.add(person1);
		System.out.println(contact.toString());
		addressBook.addContact(contact);
 		Assert.assertEquals(3, contact.size());
	}


}
	
	

	*/
