package com.example.tests;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase {

	@Test (dataProvider = "randomTestGroupGenerator")
	public void modificationSomeGroup(GroupData group) {
		 app.getNavigatioHelper().openMainPage();
		 app.getNavigatioHelper().openGroupsPage();	
		//save old state
		 List<GroupData> oldList = app.getGroupHelper().getGroups();
		
		 Random rnd = new Random();
		 int index = rnd.nextInt(oldList.size() - 1); 
		
		 //actions
		 app.getGroupHelper().initGroupModifacaton(index);
		 app.getGroupHelper().fillGroupForm(group);
		 app.getGroupHelper().submitGroupModifacaton();
		 app.getGroupHelper().returnToGroupsPage();
		 
		 //save new state
		    List<GroupData> newList = app.getGroupHelper().getGroups();
		    
		 // compare state
		  oldList.remove(index);
		  oldList.add(group);
		  Collections.sort(oldList);
		  Assert.assertEquals(newList, oldList);
	}

}
