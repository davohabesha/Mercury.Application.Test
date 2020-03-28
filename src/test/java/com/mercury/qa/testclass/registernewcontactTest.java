package com.mercury.qa.testclass;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.HomePages;
import com.mercury.qa.pages.RegstrationPage;
import com.mercury.qa.pages.SighinPages;
import com.mercury.qa.pages.registernew;
import com.mercury.qa.utility.XLUtils;

public class registernewcontactTest extends TestBase {
	
	    HomePages home;
		RegstrationPage pagee;
		SighinPages Pages;
	    registernew reg;
	public registernewcontactTest() {
		super();
	}
	@BeforeTest
	public void setup () {
		   initialization();
		   Pages= new SighinPages();
		   pagee= new RegstrationPage ();
		   home = new HomePages();
		   reg= new registernew();
	}
	
	@Test( priority=1)
	public void login () 
	{
		Pages.username("merury", "mercury");
		pagee.flightfinderform();
		home.clickonhome();
	}
	
	@Test (priority=2, dataProvider="fillingforms")
	public void forms( String namee, String fathersname ) throws InterruptedException {
	     Thread.sleep(2000);
	reg.fileincontacts(namee, fathersname);
	}
		
	
	@DataProvider (name="fillingforms")
	public String [] [] getdata() throws IOException{
		
		String path = "C:/Users/eth/Desktop/mercury.project"
				+ "/src/test/java/com/mercury/qa/testdata/login.testdata.xlsx";
	
		int rownum= XLUtils.getRowCount(path, "user");
		int colcount= XLUtils.getCellCount(path, "user", 1);

		String fillingforms[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				fillingforms[i-1][j]=XLUtils.getCellData(path,"user", i,j);
			}
		}
		
		return fillingforms;
	
	}
	
	
}
