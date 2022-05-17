package com.johndeere.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//using index
public class Demo3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		driver.findElement(By.linkText("CONTINUE")).click();
				
		
		driver.switchTo().defaultContent();
	}
}
