package com.johndeere.tabs;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Medibuddy {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		
		driver.get("https://www.medibuddy.in/");
		
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.partialLinkText("Employer")).click();
		
		List<String> windows=new ArrayList<String>(driver.getWindowHandles());	
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("getInTouchName")).sendKeys("john");
		//enter mobile number as 12345
		driver.findElement(By.id("getInTouchMobile")).sendKeys("john");
		
		// click on Get Touch Id
		driver.findElement(By.xpath("//button[text()='Get in Touch']")).click();
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}



