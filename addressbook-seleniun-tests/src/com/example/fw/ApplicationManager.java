package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
	
	 public  WebDriver driver;
	 public  String baseUrl;
	
	 private NavigatioHelper NavigationHelper;
	 private GroupHelper GroupHelper;
	 private ContactHelper ContactHelper;
	 
	public ApplicationManager(){

		 driver = new FirefoxDriver();
		 baseUrl = "http://localhost/";
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
	}

	public void stop() {
		 driver.quit();
	  	
	}
	
	public NavigatioHelper getNavigatioHelper(){
	if ( NavigationHelper == null){
		NavigationHelper = new NavigatioHelper(this);
	}
	return NavigationHelper;
	
  }
	public GroupHelper getGroupHelper(){
		if ( GroupHelper == null){
			GroupHelper = new GroupHelper(this);
		}
		return GroupHelper;
		
	  }
	public ContactHelper getContactHelper(){
		if ( ContactHelper == null){
			ContactHelper = new ContactHelper(this);
		}
		return ContactHelper;
		
	  }
}
