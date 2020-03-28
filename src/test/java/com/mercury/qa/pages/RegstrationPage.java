package com.mercury.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mercury.qa.base.TestBase;

public class RegstrationPage extends TestBase {
	
	@FindBy  (name=	"tripType")
     WebElement triptype;
	@FindBy  (name=	"passCount")
    WebElement 	passCount;
	@FindBy  (name=	"fromPort")
    WebElement fromPort;
	@FindBy  (name=	"fromMonth")
    WebElement fromMonth;
	@FindBy  (name=	"fromDay")
    WebElement fromDay;
	@FindBy  (name=	"toPort")
    WebElement toPort;
	@FindBy  (name=	"toMonth")
    WebElement toMonth;
	@FindBy  (name=	"toDay")
    WebElement toDay;
	@FindBy  (name=	"servClass")
    WebElement servClass;
	@FindBy (name= "airline")
	WebElement airline;
	@FindBy (name=	"findFlights")
	 WebElement findFlights;

	public RegstrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void flightfinderform() {
		triptype.click();
		Select a= new Select(passCount);
		a.selectByIndex(3);
	    Select b= new Select(fromPort);
	    b.selectByValue("Zurich");
	    Select c= new Select (airline);
	    c.selectByVisibleText("Unified Airlines");
	    findFlights.click();
	}
	
	
	
	
	
	
	}

