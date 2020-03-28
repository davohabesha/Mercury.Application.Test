package com.mercury.qa.testclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.HomePages;
import com.mercury.qa.pages.RegstrationPage;
import com.mercury.qa.pages.SighinPages;

public class HomePageTestcase extends TestBase{
	
	HomePages home;
	RegstrationPage pagee;
	SighinPages Pages;
	
	
public HomePageTestcase() {
	super();
}
	@BeforeMethod
	public void setup() {
		initialization();
	   Pages= new SighinPages();
	   pagee= new RegstrationPage ();
	   home = new HomePages();
	}
	@Test
	public void clickonhome() {
		Pages.username("mercury", "mercury");
		pagee.flightfinderform();
		home.clickonhome();
	}
}
