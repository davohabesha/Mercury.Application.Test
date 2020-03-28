package com.mercury.qa.testclass;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.SighinPages;

public class Sighintestcase extends TestBase {
	
	SighinPages SighinPages;
public	Sighintestcase() {
	super();
}
	@BeforeMethod 
	public void setup () {
		initialization();
		SighinPages = new SighinPages();
	}
	
	@Test (priority=1)
	public void verfysighin() throws InterruptedException {
		SighinPages.username("mercury", "mercury");
	}
	
	/*@AfterMethod
	public void teardown() {
	}*/
}
