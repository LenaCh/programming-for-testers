package com.example.tests;

public class ContactData implements Comparable<ContactData>{
	public String firstName;
	public String lastName;
	public String homePhone;
	public String mobilePhome;
	public String workPhone;
	public String mail;
	public String mail2;
	public String year;
	public String address;
	public String home;

	public ContactData() {
			}
	public ContactData(String firstName, String lastName, String homePhone,
			String mobilePhome, String workPhone, String mail, String mail2,
			String year, String address, String home) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.homePhone = homePhone;
		this.mobilePhome = mobilePhome;
		this.workPhone = workPhone;
		this.mail = mail;
		this.mail2 = mail2;
		this.year = year;
		this.address = address;
		this.home = home;
	}
	@Override
	public String toString() {
		return "ContactData [firstName=" + firstName + ", lastname=" + lastName + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result
			//	+ ((firstName == null) ? 0 : firstName.hashCode());
	//	result = prime * result
			//	+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
	
	
public int compareTo(ContactData other) {
		
		return this.firstName.toLowerCase().compareTo(other.firstName.toLowerCase());
	}
	
}
