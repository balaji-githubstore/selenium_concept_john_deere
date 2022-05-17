package com.johndeere.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Actions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		driver.get("https://nasscom.in/about-us/career");
		
		//mousehover on //a[text()='Membership']
		Actions actions=new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Membership']")))
		.moveToElement(driver.findElement(By.xpath("//a[text()='Become a member']"))).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();
		
		//driver.findElement(By.partialLinkText("APPLY ONLINE")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Click to Apply Online')]")).click();
	}

}




