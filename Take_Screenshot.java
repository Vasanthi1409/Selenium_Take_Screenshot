package take_Screenshot.com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.TakesScreenshot;
import java.io.*;

public class Take_Screenshot {
	
	String name;
	
	public void ts_Method(String T1) throws IOException {		
		WebDriver D = new ChromeDriver();
		D.get("http://www.google.com/");
		name = "Google";
		
		TakesScreenshot ts = (TakesScreenshot) D;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\take_Screenshot\\com\\"+name+".png");
		FileUtils.copyFile(screenshotAs, des);
	}
	
	public void ts_Method(String T2, String T3) throws IOException {
		if(T2.equals(T3)) {
			WebDriver D = new ChromeDriver();
			D.get("https://web.whatsapp.com/");
			name = "Whatsapp";
			
			TakesScreenshot ts = (TakesScreenshot) D;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\take_Screenshot\\com\\"+name+".png");
			FileUtils.copyFile(screenshotAs, des);
			
		}else {
			WebDriver D = new ChromeDriver();
			D.get("https://www.w3schools.com/");
			name = "W3Schools";
			
			TakesScreenshot ts = (TakesScreenshot) D;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\take_Screenshot\\com\\"+name+".png");
			FileUtils.copyFile(screenshotAs, des);
		}	
	}

	public static void main(String[] args) throws IOException {
		
		Take_Screenshot TS = new Take_Screenshot();
		TS.ts_Method("Chrome");
		TS.ts_Method("Whatsapp", "W3Schools");
	}

}
