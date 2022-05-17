package com.johndeere.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5PhpHotels {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://phptravels.net");
		
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
	
		driver.findElement(By.xpath("//span[contains(text(),'Search by City')]")).click();
		
		driver.findElement(By.xpath("//input[@role='searchbox']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai,India']")).click();
	
		//driver.executeScript("document.querySelector('[id=checkin]').value='30-06-2022'");
		
	}

}






