package com.Alert;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.Alert;

public class ConfirmationAlert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///D:/JAVA%20FULL%20STACK%20(10K%20CODERS)"
				+ "/JAVA/SeleniumAutomationFramework/src/test/java/com/"
				+ "Alert/LoginPage.html?user=&pass=");
		
		driver.findElement(By.id("confirmBtn")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String message = alert.getText();
		
		System.out.println(message);
		
		alert.dismiss();
		
		WebElement result =driver.findElement(By.id("confirmResult"));
		
		System.out.println(result.getText());
		
		driver.quit();
        
	}

}
