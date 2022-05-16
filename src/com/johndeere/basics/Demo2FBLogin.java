package com.johndeere.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2FBLogin {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("authUser")).sendKeys("admin");
		
		By loc=By.id("email");
		WebElement ele = driver.findElement(loc);
		ele.sendKeys("hello@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("welcome123");
		
		driver.findElement(By.name("login")).click();
	}

}
