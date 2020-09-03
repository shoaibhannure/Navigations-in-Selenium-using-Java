package com.shoaib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		//get() vs navigate().to()
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in"); // launch URL
		
		Thread.sleep(5000);
		driver.navigate().to("https://www.flipkart.com"); //navigated to Flipkart
		
		//back and forward button simulation
		driver.navigate().back(); //back to Amazon
		Thread.sleep(5000);
		
		driver.navigate().forward(); //again navigated to Flipkart
		Thread.sleep(5000);
		
		driver.navigate().back(); //again back to Amazon
		Thread.sleep(5000);
		driver.navigate().refresh(); //Amazon Page Refreshed
		
	}

}
