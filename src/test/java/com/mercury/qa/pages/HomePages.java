package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.qa.base.TestBase;

public class HomePages extends TestBase {
	
	@FindBy (xpath="/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")
	WebElement homebtn;
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")
	WebElement regbtn;
	public HomePages() {
		PageFactory.initElements(driver, this);
	}

	public void clickonhome() {
		homebtn.click();
		regbtn.click();
	}
	
}
