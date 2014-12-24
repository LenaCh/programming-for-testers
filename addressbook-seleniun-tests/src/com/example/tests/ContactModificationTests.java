package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
	@Test
	public void modificationSomeContact() {
		 app.getNavigatioHelper().openMainPage();
		 app.getContactHelper().initContactModification(1);
		 ContactData Contact = new ContactData();
		 Contact.firstName = "new firstName";
		 app.getContactHelper().fillContactCreationForm(Contact);
		 app.getContactHelper().modificationContact();
		 app.getContactHelper().reternToMainPage();
	}
}
