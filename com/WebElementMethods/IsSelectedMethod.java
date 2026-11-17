package com.WebElementMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/JAVA/SeleniumAutomationFramework/src/test/java/com/WebElementMethods/LoginPage.html");
		
		WebElement checkBox = driver.findElement(By.id("rememberMe"));
		
		boolean status = checkBox.isSelected();
		
		System.out.println(status);
		
		Thread.sleep(1000);
		
		checkBox.click();
		
		Thread.sleep(1000);
		
		System.out.println(checkBox.isSelected());
		
		Thread.sleep(1000);
		
		driver.quit();
	}

}