package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.Alert;

public class AlertUsingJavaScript {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		js.executeScript("alert('Welcome to JavascriptExecutor');");
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		alert.accept();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
