package com.codepractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args)
	{
		 

				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();				
				driver.get("https://www.amazon.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
				WebElement a= driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
				WebElement b= driver.findElement(By.xpath("//span[contains(text(),'AmazonSmile Charity Lists')]"));
				Actions ac= new Actions(driver);
				ac.moveToElement(a).moveToElement(b).click().build().perform();

				
	}

}
