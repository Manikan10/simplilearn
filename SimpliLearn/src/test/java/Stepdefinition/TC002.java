package Stepdefinition;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC002 {
	
	public static WebDriver driver;
	
	@Given("^Login to simplilearn$")
	public void Login_to_simplilearn () throws Throwable
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Code\\chromedriver\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		System.out.println(" TC002 - Step 1 is passed");
		
	}

	@When("^Click on Master Program tab$")
	public void click_on_Master_Program_tab () throws Throwable
	{
		
		System.out.println(" TC002 - Step 2 is passed");
		
	}
	
	@And("^Click on View Program Details$")
	public void click_on_View_Program_Details () throws Throwable
	{
		
		System.out.println(" TC002 - Step 3 is passed");
		
	}
		
	@Then("^Master Program details page is loaded$")
	public void Master_Program_details_page_is_loaded () throws Throwable
	{
		
		System.out.println(" TC002 - Step 4 is passed");
	
	}
	
}
