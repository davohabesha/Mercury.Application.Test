package com.mercury.qa.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mercury.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICITY=20;


	public static void takescreenshotattheend () throws IOException{
	
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // capture the screenshot file
			File target = new File(System.getProperty("user.dir") + "/Screenshots/" + System.currentTimeMillis() + ".png");
			FileUtils.copyFile(source, target);
			System.out.println("screenshot catured"); }
		
}

