package com.mercury.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import com.mercury.qa.utility.WebEventListener;

public class TestBase {
public static WebDriver driver;
public static Properties prop;
public static EventFiringWebDriver e_driver;
public static WebEventListener eventlistener;
	public TestBase()  {
		
		
			try {
				prop= new Properties();	
				FileInputStream ip = new FileInputStream("C:/Users/eth/Desktop/mercury.project/"
					+"src/test/java/com/mercurt/qa/config/config.properties");
				prop.load(ip);	
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
		
				e.printStackTrace();
			}
			  
		
	}
		
		public static void initialization() {
		String browserName= prop.getProperty("browser");
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\eth\\Desktop\\geckodriver.exe" );
			driver= new FirefoxDriver();
		}
		
		else if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Users/eth/Desktop/es/chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		e_driver = new EventFiringWebDriver(driver);
		eventlistener= new WebEventListener ();
		e_driver.register(eventlistener);
		driver=e_driver;
		
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		}
	
}
	
	

