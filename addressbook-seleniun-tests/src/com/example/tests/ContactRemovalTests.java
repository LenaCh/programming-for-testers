package com.example.tests;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactRemovalTests extends TestBase {
	@Test
	public void deleteSomeContact() {
		 app.getNavigatioHelper().openMainPage();
		//save old state
		 List<ContactData> oldList = app.getContactHelper().getContacts();
		 			 
		 //actions
		 
		 Random rnd = new Random();
		 int index = rnd.nextInt(oldList.size()-1);
		 
		 app.getContactHelper().initContactModification(index);
		 app.getContactHelper().deleteContact();
		 app.getContactHelper().reternToMainPage();
		 
		//save new state
		  List<ContactData> newList = app.getContactHelper().getContacts();
		    
		 // compare state
		  oldList.remove(index + 1);
		  Collections.sort(oldList);
		  Collections.sort(newList);
		  Assert.assertEquals(newList, oldList);
	}
}
