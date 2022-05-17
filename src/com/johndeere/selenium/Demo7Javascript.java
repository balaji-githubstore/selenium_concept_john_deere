package com.johndeere.selenium;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7Javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	
		driver.get("https://nasscom.in/about-us/career");
		
		//driver.findElement(By.xpath("//a[text()='Membership Benefits']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Membership Benefits']"));
		js.executeScript("arguments[0].click();", ele);
	}
}




