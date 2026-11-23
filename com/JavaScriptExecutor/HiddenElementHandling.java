package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;

public class HiddenElementHandling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement hideinput = driver.findElement(By.id("hiddenInput"));
		
		System.out.println(hideinput.isDisplayed());  
		
		js.executeScript("arguments[0].style.display='block';", hideinput);
		
		System.out.println(hideinput.isDisplayed());
		
		System.out.println(hideinput.getAttribute("value"));
		
		driver.quit();

	}

}
