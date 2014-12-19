package com.example.fw;

import org.openqa.selenium.By;

public class NavigatioHelper extends HelperBase{

	public NavigatioHelper(ApplicationManager manager) {
		super(manager);
	  }

	public void openMainPage() {
		manager.driver.get(manager.baseUrl + "/addressbookv4.1.4/");
	  }

	public void openGroupsPage() {
		click(By.linkText("groups"));
	  }

}
