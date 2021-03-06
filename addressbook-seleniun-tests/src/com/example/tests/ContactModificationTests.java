package com.example.tests;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{
	
	
	@Test (dataProvider = "randomValidContactGenerator")
	
	public void modificationSomeContact(ContactData Contact) {
		 app.getNavigatioHelper().openMainPage();
		 
		//save old state
		 List<ContactData> oldList = app.getContactHelper().getContacts();
		 
		 //actions
		 
		 Random rnd = new Random();
		 int index = rnd.nextInt(oldList.size()-1);
		 
		 app.getContactHelper().initContactModification(index);
		 app.getContactHelper().fillContactCreationForm(Contact);
		 app.getContactHelper().modificationContact();
		 app.getContactHelper().reternToMainPage();
		 
		 //save new state
		    List<ContactData> newList = app.getContactHelper().getContacts();
		    
		 // compare state
		  oldList.remove(index + 1);
		  oldList.add(Contact);
		  Collections.sort(oldList);
		  Collections.sort(newList);
		  Assert.assertEquals(newList, oldList);
	}
}
