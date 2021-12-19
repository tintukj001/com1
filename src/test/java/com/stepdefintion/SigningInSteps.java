package com.stepdefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigningInSteps extends Base {
	SignInPage sp;
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		getDriver();
		sp=PageFactory.initElements(driver, SignInPage.class);
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		//driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')] ")).click();
	    //driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9417879693");
		sp.getSignin();
	   sp.getUsername(); 
	}

	@When("I complete action")
	public void i_complete_action() {
		sp.getSignedin();
		
	    
	}

	@When("some other action")
	public void some_other_action() {
		//driver.findElement(By.xpath("//input[@id='continue']")).click();	
		
	}

	@When("yet another action")
	public void yet_another_action() {
	
		
	   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	
	Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
	   
	}
	

}
