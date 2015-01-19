package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {
	protected ApplicationManager app;
  

	@BeforeSuite
	public void setUp() throws Exception {
		app = new ApplicationManager();
	   	  }
	@AfterSuite
	public void tearDown() throws Exception {
        app.stop();
	   
	  }
	@DataProvider
	public Iterator<Object[]> randomTestGroupGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		
		for(int i=1; i<5; i++);{
			GroupData group = new GroupData();
			group.name  = generateRandovString();		
			group.footer  = generateRandovString();		
			group.header  = generateRandovString();		
							 
			list.add(new Object[]{group});
		}
		return list.iterator();
	}
	
	@DataProvider
	public Iterator<Object[]> randomValidContactGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		
		for(int i=0; i<5; i++);{
			ContactData contact = new ContactData();
			contact.firstName = generateRandovString();		
			//contact.lastName = generateRandovString();		
			contact.address = generateRandovString();		
			contact.home = generateRandovString();  
			list.add(new Object[]{contact});
			}
		return list.iterator();
	}
	
	public String generateRandovString(){ //генератор случайных чисел
		Random rnd = new Random();	
	if(rnd.nextInt(3) == 0){
		return  "";		
	} else {
		return  "test" + rnd.nextInt();
	}
	}
}
