package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class SighinPages extends TestBase {

	@FindBy(name="userName")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(name="login")
	WebElement submit;
	
	public SighinPages() {
		PageFactory.initElements(driver, this);
		}
	
	
	public void username(String name, String  pass) {
		username.sendKeys(name);

		password.sendKeys(pass);
		submit.click();
	}
	
	
}
