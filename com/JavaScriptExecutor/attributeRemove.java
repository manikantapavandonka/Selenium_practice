package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

public class attributeRemove {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor  js = (JavascriptExecutor)driver;
		
		WebElement input = driver.findElement(By.id("disabledInput"));
		
		System.out.println(input.isEnabled());
		
		js.executeScript("arguments[0].removeAttribute('disabled');", input);
		
		System.out.println(input.isEnabled());
		
		String title = input.getAttribute("value");
		
		System.out.println(title);
		
		driver.quit();

	}

}
