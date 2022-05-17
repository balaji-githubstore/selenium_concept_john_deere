package com.johndeere.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Mutlipletabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("//img[contains(@src,'app-close.png')]")).click();
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		//switch to second tab
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());	
		driver.switchTo().window(windows.get(1));
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Forgot User ID?')]")).click();

		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		//date //not working 
		driver.findElement(By.id("bill-date-long")).sendKeys("14/05/2000");
	}
}

