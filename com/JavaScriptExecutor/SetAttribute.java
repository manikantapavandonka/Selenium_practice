package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

public class SetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement input = driver.findElement(By.id("userInput"));
		
		String placeHolder = input.getAttribute("placeholder");
		
		System.out.println(placeHolder);
		
		js.executeScript("arguments[0].setAttribute('placeholder','Enter your full name');", input);
		
		String updated = input.getAttribute("placeholder");
		
		System.out.println(updated);
		
		js.executeScript("arguments[0].value='Nikhil';",input);
		
		String value = input.getAttribute("value");
		
		System.out.println(value);
		
		driver.quit();
	}

}
