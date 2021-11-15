package addressBook;

/**
 * Purpose : creating contact in AddressBook
 *	use : constructor ,getters_settrers,toString()
 */

public class Contact {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public String email;
	public long mobileNo;
	public int zip;
	
	
	public Contact(String firstName, String lastName, String address, String city, String state, String email,
			long mobileNo, int zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.mobileNo = mobileNo;
		this.zip = zip;
	}

	//getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", Address=" + address + ", city=" + city
				+ ", state=" + state + ", pincode=" + zip + ", MobileNo=" + mobileNo + "]" + "\n";
	}
}