package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    openGroupsPage();
    initGroupCreation();
    GroupData group = new GroupData();
    group.name = "group name 1";
	group.header = "header 1";
	group.name = "footer 1";
	fillGroupForm(group);
    submitGroupCriation();
    returnToGroupsPage();
  }

  @Test
  public void testEmptyGroupCreation1() throws Exception {
    openMainPage();
    openGroupsPage();
    initGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCriation();
    returnToGroupsPage();
  }
}

