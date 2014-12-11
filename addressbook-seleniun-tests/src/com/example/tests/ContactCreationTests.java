package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
   
  @Test
  public void testEmptyGroupCreation() throws Exception {
    openMainPage();
    InitNewContactCreation();
    ContactData contact = new ContactData();
    contact.firstName="Petrov";
    contact.lastName="Ivan";
    contact.homePhone="8-812-555-55-55";
    contact.mobilePhome="+79219999090";
    contact.workPhone="8-812-666-66-66";
    contact.mail="petrov@gm.ru";
    contact.mail2="petrov2@gm.ru";
    contact.year="1999";
    contact.address="Saint-Petersburg";
    contact.home="8";
    fillContactCreationForm(contact);
    SelectContactData select = new SelectContactData();
    select.day= "28";
    select.month= "September";
    select.group= "footer 1";
	selectContactDetailsFromContactCreationForm(select);
    reternToMainPage();
  }
  
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    InitNewContactCreation();
    fillContactCreationForm(new ContactData("", "", "", "", "", "", "", "", "", ""));
      reternToMainPage();
  }
}
 
  