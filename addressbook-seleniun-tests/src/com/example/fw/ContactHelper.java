package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.apache.bcel.generic.NEWARRAY;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
	//	type(By.name("lastName"),contact.lastName);
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
	  	   click(By.linkText("home page"));
	}

	public void initContactModification(int index) {
	
		click(By.xpath("(//img[@alt='Edit'])[" + (index+1) + "]"));
		
	}

	public void deleteContact() {
		click(By.xpath("(//input[@name='update'])[2]"));
	}

	public void modificationContact() {
		click(By.xpath("(//input[@name='update'])"));
		
	}
 

public List<ContactData> getContacts() {
	List<ContactData> contacts = new ArrayList<ContactData>();
	List<WebElement> line = driver.findElements(By.xpath("//table/tbody/tr"));
	for (WebElement lines : line) {
		ContactData contact = new ContactData();
		   contact.firstName= lines.findElement(By.xpath("//td[3]")).getText();
		   contact.lastName= lines.findElement(By.xpath("//td[2]")).getText();
		   contacts.add(contact);
	} 
		
	return contacts;
}
}
