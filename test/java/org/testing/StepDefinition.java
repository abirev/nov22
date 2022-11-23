package org.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition {
	WebDriver driver;
	@Given("user launch fb")
	public void user_launch_fb() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/login.php");
	}

	@When("user -enter username pwd")
	public void user_enter_username_pwd() {
	   driver.findElement(By.id("email")).sendKeys("abi");
	   driver.findElement(By.id("pass")).sendKeys("rev");
	   
	}

	@And("click button")
	public void click_login_button() {
	   driver.findElement(By.name("login")).click();
	}
	
	@Then("check the login worked or not")
	public void check_the_login_worked_or_not() {
	   String title=driver.getTitle();
	   System.out.println("title");
	  boolean contains= title.contains("facebook");
	  Assert.assertTrue(contains);
	 
	  
	   
	}



}
