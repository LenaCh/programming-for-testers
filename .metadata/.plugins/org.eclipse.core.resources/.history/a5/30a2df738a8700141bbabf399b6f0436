package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;
import com.example.tests.SelectContactData;

public class ContactHelper extends HelperBase{

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void InitNewContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactCreationForm(ContactData contact) {
		type(By.name("firstname"),contact.firstName);
		type(By.name("address"),contact.lastName);
		type(By.name("home"),contact.homePhone);
		type(By.name("mobile"),contact.mobilePhome);
		type(By.name("work"),contact.workPhone);
		type(By.name("email"),contact.mail);
		type(By.name("email2"),contact.mail2);
		type(By.name("byear"),contact.year);
		type(By.name("address2"),contact.address);
		type(By.name("phone2"),contact.home);
	 
	}

	public void selectContactDetailsFromContactCreationForm(SelectContactData select) {
		selectBytext(By.name("bday"), select.day);
		selectBytext(By.name("bmonth"), select.month);
		selectBytext(By.name("new_group"), select.group);
	   	}

	public void reternToMainPage() {
	   click(By.name("submit"));
	   click(By.linkText("home page"));
	}

}
