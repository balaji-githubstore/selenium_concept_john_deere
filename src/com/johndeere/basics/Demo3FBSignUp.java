package com.johndeere.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.get("https://www.facebook.com/"); //wait for page load to happen
		
		driver.findElement(By.linkText("Create New Account")).click(); //findelement - takes 0.5s to check for presence of element
		
		driver.findElement(By.name("firstname")).sendKeys("Balaji");
		driver.findElement(By.name("lastname")).sendKeys("Dinakaran");
		
		driver.findElement(By.name("reg_email__")).sendKeys("787878787");
		
		driver.findElement(By.id("password_step_input")).sendKeys("welcome123");
		
		//dob - 20 Dec 1999
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("20");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Dec");
		//selectMonth.selectByValue("12");
//		selectMonth.selectByIndex(11);
		
		//select year as 1999
		Select selectYear=new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		selectYear.selectByVisibleText("1999");
	
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
//		driver.findElement(By.cssSelector("[value='-1']")).click();
		
		//click on signup
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
}



