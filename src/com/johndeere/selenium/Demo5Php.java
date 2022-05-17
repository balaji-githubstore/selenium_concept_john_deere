package com.johndeere.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5Php {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://phptravels.net");
		
		driver.findElement(By.xpath("//a[text()='flights']")).click();
		
		driver.findElement(By.id("autocomplete")).sendKeys("LAX");
		driver.findElement(By.xpath("//b[text()='LAX']")).click();
		
		driver.findElement(By.id("autocomplete2")).sendKeys("DAL");
		Actions action=new Actions(driver);
		action.pause(1000).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
 
		driver.findElement(By.id("departure")).clear();
		driver.findElement(By.id("departure")).sendKeys("30-06-2022");
//		7.	Adult as 4
//		8.	Child as 2 

//		9. click on search
		
		
	}

}
