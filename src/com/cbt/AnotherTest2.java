package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"/Users/azamattattibayev/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();	// openning Chrome browser
		
		driver.navigate().to("http://newtours.demoaut.com");	// navigating to URL
		
		Thread.sleep(2000);	// waiting 2 seconds
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password" )).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		
		String expected = "Find a Flight";
		String actual = driver.getTitle();
		
		if(actual.contains(expected)){
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}
		
		driver.close();	// closes the current tab only
		
		//driver.quit();	// closes all tabs and windows and ends the session
	}

}
