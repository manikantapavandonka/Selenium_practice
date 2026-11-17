package com.WebElementMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/JAVA/SeleniumAutomationFramework/src/test/java/com/WebElementMethods/LoginPage.html");
		
		WebElement username = driver.findElement(By.name("user"));
		
		username.sendKeys("karthik");
		
		Thread.sleep(3000);
		
		username.clear();
		
		Thread.sleep(3000);
		
		username.sendKeys("rahul");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("Lucky@123");
		
		Thread.sleep(3000);
		
		password.clear();
		
		Thread.sleep(3000);
		
		password.sendKeys("rahul@123");
		
		WebElement button = driver.findElement(By.id("loginBtn"));
		
		Thread.sleep(3000);
		
		button.click();
		
	}

}
