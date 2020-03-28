package com.mercury.qa.testclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.RegstrationPage;
import com.mercury.qa.pages.SighinPages;

public class RegstrationTestcase extends TestBase{
	SighinPages SighinPages;
	RegstrationPage page;
	
	public RegstrationTestcase() {
		super();
	}
	@BeforeMethod 
	public void setup () {
		initialization();
		SighinPages = new SighinPages();
		page = new RegstrationPage();
	}
	
	@Test 
	public void flightfindertest() {
		SighinPages.username("mercury", "mercury");
		page.flightfinderform();
	}
}
