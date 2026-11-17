package com.WebElementMethods;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultipleDropdownSelection {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)"
				+ "/JAVA/SeleniumAutomationFramework/src/test/java"
				+ "/com/WebElementMethods/LoginPage.html");
		
		WebElement skillsElement = driver.findElement(By.id("skills"));
		
		Select dropDown = new Select(skillsElement);
		
		System.out.println(dropDown.isMultiple());
		
		Thread.sleep(3000);
		
		dropDown.selectByVisibleText("Java");
		
		Thread.sleep(1000);
		
		dropDown.selectByValue("python");
		
		Thread.sleep(1000);
		
		dropDown.selectByIndex(2);
		
		Thread.sleep(3000);
		
		List<WebElement> selectedOptions = dropDown.getAllSelectedOptions();
		
		for(WebElement options : selectedOptions) {
			System.out.println(options.getText());
		}
		
		Thread.sleep(3000);
		
		dropDown.deselectByVisibleText("Java");
		
		Thread.sleep(1000);
		
		dropDown.deselectByValue("python");
		
		Thread.sleep(1000);
		
		dropDown.deselectByIndex(2);
		
		dropDown.deselectAll();
		
		List<WebElement>remainingOptions = dropDown.getAllSelectedOptions();
		
		System.out.println("Remaining selections: "+remainingOptions.size());
		
		driver.quit();

	}

}
