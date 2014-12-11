package com.example.tests;

public class ContactData {
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
}