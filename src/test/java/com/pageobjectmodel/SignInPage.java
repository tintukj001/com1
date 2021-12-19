package com.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
public WebDriver driver;

public SignInPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}
@FindBy(xpath="//span[contains(text(),'Hello, Sign in')] ")
WebElement signin;
public void getSignin () {
	signin.click();
}
@FindBy(xpath="//input[@id='ap_email']")
WebElement username;
public void getUsername() {
	username.sendKeys("9417879693");
	
}
@FindBy(xpath="//input[@id='continue']")
WebElement signedin;
public void getSignedin() {
	signedin.click();
	
}
}
