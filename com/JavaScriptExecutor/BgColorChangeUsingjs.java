package com.JavaScriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

public class BgColorChangeUsingjs {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)/"
				+ "JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "JavaScriptExecutor/NewFile.html");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String intialTitle=driver.getTitle();
		
		System.out.println(intialTitle);
		
		js.executeScript("document.body.style.backgroundColor='lightblue';");
		
		String currentTitle = driver.getTitle();
		System.out.println(currentTitle);
		
		js.executeScript("document.body.style.backgroundColor='lightgreen';");
		
		driver.quit();

	}

}
