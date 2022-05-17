package com.johndeere.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1Goto {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.goto.com/meeting");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.linkText("Try Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Balaji");
		
		Select selectSize=new Select(driver.findElement(By.id("CompanySize")));
		selectSize.selectByVisibleText("10 - 99");
		
		//button[contains(text(),'Trial')]
		driver.findElement(By.xpath("//button[text()='Start My Trial']")).click();
	}

}


