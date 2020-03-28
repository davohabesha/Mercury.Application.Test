package com.mercury.qa.pages;

import org.apache.xmlbeans.impl.tool.XSTCTester.TestCase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class registernew extends TestBase {

	
	@FindBy(name="firstName")
	WebElement name;
	@FindBy(name="lastName")
	WebElement Fathername;
	
	public registernew () {
		PageFactory.initElements(driver, this);
	}
	public void fileincontacts(String namee, String fathersname) {
		name.sendKeys(namee);
		Fathername.sendKeys(fathersname);
		name.clear();
		Fathername.clear();
	}
}