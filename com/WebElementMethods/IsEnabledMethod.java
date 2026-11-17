package com.WebElementMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/JAVA/SeleniumAutomationFramework/src/test/java/com/WebElementMethods/LoginPage.html");
		
		WebElement button = driver.findElement(By.id("loginBtn"));
		
		boolean status = button.isEnabled();
		
		System.out.println(status);
		
		driver.quit();
	}

}