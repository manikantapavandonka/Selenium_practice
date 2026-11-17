package com.WebElementMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class SendKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/JAVA/SeleniumAutomationFramework/src/test/java/com/WebElementMethods/LoginPage.html");
		
		WebElement username = driver.findElement(By.name("user"));
		
		username.sendKeys("karthik");
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("Lucky@123");
		

	}

}
