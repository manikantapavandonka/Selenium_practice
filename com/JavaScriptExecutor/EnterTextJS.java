package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

public class EnterTextJS {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement input = driver.findElement(By.id("jsName"));
		
        js.executeScript("arguments[0].value = 'Nikhil';", input);
        
		WebElement button = driver.findElement(By.id("showNameBtn"));
		
		button.click();
		
		WebElement result = driver.findElement(By.id("nameResult"));
		
		System.out.println(result.getText());
		
		driver.quit();

	}

}
