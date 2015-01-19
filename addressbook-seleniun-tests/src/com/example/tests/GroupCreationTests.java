package com.example.tests;

import java.util.Collections;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {
	
	
   @Test(dataProvider = "randomTestGroupGenerator")
public void testValidDataGroupCreation(GroupData group) throws Exception {
	   
    app.getNavigatioHelper().openMainPage();
    app.getNavigatioHelper().openGroupsPage();
    
    //save old state
    
    List<GroupData> oldList = app.getGroupHelper().getGroups();
    //actions
    app.getGroupHelper().initGroupCreation();
   	app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().submitGroupCriation();
    app.getGroupHelper().returnToGroupsPage();
    //save new state
    List<GroupData> newList = app.getGroupHelper().getGroups();
    // compare state
    
    oldList.add(group);
    Collections.sort(oldList);
    Assert.assertEquals(newList, oldList);
  }


}
