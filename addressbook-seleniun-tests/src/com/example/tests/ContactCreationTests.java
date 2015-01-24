package com.example.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
 

		  
 @Test(dataProvider = "randomValidContactGenerator")
 public void testValidContactCreationTest(ContactData contact) throws Exception {
   app.getNavigatioHelper().openMainPage();
   
   //save old state
   List<ContactData> oldList = app.getContactHelper().getContacts();
   
   //actions
   app.getContactHelper().InitNewContactCreation();
   app.getContactHelper().fillContactCreationForm(contact);
   SelectContactData select = new SelectContactData();
   select.day= "28";
   select.month= "September";
   select.group= "footer 1";
   app.getContactHelper().selectContactDetailsFromContactCreationForm(select);
   app.getGroupHelper().submitGroupCriation();
   app.getContactHelper().reternToMainPage();

   //save new state
   List<ContactData> newList = app.getContactHelper().getContacts();
   // compare state
   
   oldList.add(contact);
   Collections.sort(oldList);
   Collections.sort(newList);
   Assert.assertEquals(newList, oldList); 
 }
}