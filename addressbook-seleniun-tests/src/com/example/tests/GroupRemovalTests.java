package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase{

	@Test
	public void deleteSomeGroup() {
		 app.getNavigatioHelper().openMainPage();
		 app.getNavigatioHelper().openGroupsPage();	
		 app.getGroupHelper().deleteGroup(1);
		 app.getGroupHelper().returnToGroupsPage();
	}
}
