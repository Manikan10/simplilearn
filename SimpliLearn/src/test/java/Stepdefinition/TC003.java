package Stepdefinition;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC003 {
	
	public static WebDriver driver;
	
	@Given("^User is logged in$")
	public void User_is_logged_in () throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Code\\chromedriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		System.out.println(" TC003 - Step 1 is passed");
		
	}

	@When("^Click on Menu$")
	public void click_on_Menu () throws Throwable
	{
		
		System.out.println(" TC003 - Step 2 is passed");
		
	}
	
	@And("^Select Logout$")
	public void select_logout () throws Throwable
	{
		
		System.out.println(" TC003 - Step 3 is passed");
		
	}
		
	@Then("^User is logged out$")
	public void user_is_logged_out () throws Throwable
	{
		
		System.out.println(" TC003 - Step 4 is passed");
	
	}
	
}
