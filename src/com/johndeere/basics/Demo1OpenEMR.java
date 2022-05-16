package com.johndeere.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
	
public class Demo1OpenEMR {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver(); //run time ploymorphism 
		driver.get("http://demo.openemr.io/b/openemr");
		
		//wait for id=authUser presence 
				
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
}
