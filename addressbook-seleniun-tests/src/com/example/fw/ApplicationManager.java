package com.example.fw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ApplicationManager {
	
	 public  WebDriver driver;
	 public  String baseUrl;
	
	 private NavigatioHelper navigatioHelper;
	 private GroupHelper groupHelper;
	 private ContactHelper contactHelper;
	 
	public ApplicationManager(){

		 driver = new FirefoxDriver();
		 baseUrl = "http://localhost/";
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 navigatioHelper = new NavigatioHelper(this);				
	}

	public void stop() {
		 driver.quit();
	  	
	}
	
	
	
	public NavigatioHelper getNavigatioHelper(){
		if (navigatioHelper == null) {
			navigatioHelper = new NavigatioHelper(this);
		}
		return navigatioHelper;
	  }
	
	public GroupHelper getGroupHelper(){
		if (groupHelper == null) {
			groupHelper = new GroupHelper(this);
		}
		return groupHelper; 
		
	}
	
	
	
	public ContactHelper getContactHelper(){
		if ( contactHelper == null){
			contactHelper = new ContactHelper(this);
		}
		return contactHelper;
		
	  }
}

