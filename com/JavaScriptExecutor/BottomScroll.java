package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

public class BottomScroll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500);");
		
		WebElement bottom = driver.findElement(By.id("bottomHeading"));
		
		js.executeScript("arguments[0].scrollIntoView();", bottom);
		
		System.out.println(bottom.getText());
		
		driver.quit();

	}

}
