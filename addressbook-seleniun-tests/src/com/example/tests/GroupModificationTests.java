package com.example.tests;

import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase {

	@Test
	public void modificationSomeGroup() {
		 app.getNavigatioHelper().openMainPage();
		 app.getNavigatioHelper().openGroupsPage();	
		 app.getGroupHelper().initGroupModifacaton(1);
		 GroupData group = new GroupData();
		 group.name = "new name";
		 app.getGroupHelper().fillGroupForm(group);
		 app.getGroupHelper().submitGroupModifacaton();
		 app.getGroupHelper().returnToGroupsPage();
	}
}
