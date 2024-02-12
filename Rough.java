package take_Screenshot.com;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import java.io.*;

public class Rough {

	public void ts_Method(String T1) throws IOException {		
		Rough.tkmethod(T1, "w3schools");
	}

	public void ts_Method(String T2, String T3) throws IOException {
		String web, Lname;
		if(T2.equals(T3)){
			web = T2;
			Lname = "Google";
		}else {
			web = T3;
			Lname = "Whatsapp";
		}
		Rough.tkmethod(web, Lname);
	}
	
	public static void tkmethod(String Website, String name) throws IOException {
		
		String W, N;
		
		if(name.equals("w3schools")) {			
			W = Website; 
			N = name;			
		}else {
			W = Website; 
			N = name;
		}		

		WebDriver D = new ChromeDriver();
		D.get(Website);
		TakesScreenshot ts = (TakesScreenshot) D;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Selenium_Demo\\src\\take_Screenshot\\com\\"+N+".png");
		FileUtils.copyFile(screenshotAs, des);	
		System.out.println("Successfully Completed");
	}
	
	

	public static void main(String[] args) throws IOException {

		Rough TS = new Rough();
		TS.ts_Method("https://www.w3schools.com/");
		TS.ts_Method("http://www.google.com/", "https://web.whatsapp.com/");

	}

}
