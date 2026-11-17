package com.WebElementMethods;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class SelectElementHandling {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)"
				+ "/JAVA/SeleniumAutomationFramework/"
				+ "src/test/java/com/WebElementMethods/LoginPage.html");
		
		WebElement dropDown = driver.findElement(By.id("course"));
		
		Thread.sleep(3000);
		
		dropDown.click();
		
		Select dropdown = new Select(dropDown);
		
		dropdown.selectByVisibleText("Java");
		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		String option = selectedOption.getText();
		System.out.println(option);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
