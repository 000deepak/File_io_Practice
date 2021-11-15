package addressBook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * Purpose : adding data from contact.java
 */

public class AddressBook {

	static AddressBook addressbook = new AddressBook();

	public static void main(String[] args) {

		ArrayList<Contact> contact = new ArrayList<Contact>();

		Contact person2 = new Contact("pranav", "dani", "ddd", "pune", "Maharastra", "@gmail.com",
				8089987898L, 64011);

		contact.add(person2);

		addContact(contact);

	}

	public static boolean addContact(ArrayList<Contact> contact) {
		try {
			if (addressbook.checkFile(contact)) {
				System.out.println("person is added in file");
			}
			return true;
		} catch (IOException e) {
			System.out.println("person not added in file");
		}
		return false;
	}

	/*
	 * Purpose : Using IO File read data from file
	 */
	public static boolean checkFile(ArrayList<Contact> contact) throws IOException {
		String HOME = System.getProperty("user.home");
		String fileName = "add1.csv";
		Path homePath = Paths.get(HOME);
		if (Files.exists(homePath)) {
			Path filePath = Paths.get(HOME + "/" + fileName);
			try {
				if (Files.exists(filePath)) {
					if (writeFile(new File(fileName), contact)) {
						return true;
					}
				} else {
					Files.createFile(filePath);
					if (writeFile(new File(fileName), contact)) {
						return true;
					}
				}
				return true;
			} catch (IOException e) {
				return false;
			}
		}
		return false;
	}

	/*
	 * Purpose : Using IO File write data to file
	 */
	private static boolean writeFile(File fileName, ArrayList<Contact> contact) {
		try {
			FileWriter myWriter = new FileWriter(fileName);
			for (Contact contactperson : contact) {
				myWriter.write(contactperson + "\n");
			}
			myWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

}
