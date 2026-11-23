package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

public class GetPageInfoJs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String title = (String) js.executeScript("return document.title;");
		
		String URL =(String)js.executeScript("return window.location.href;");
		
		System.out.println(title);
		
		System.out.println(URL);
		
		driver.quit();

	}

}
