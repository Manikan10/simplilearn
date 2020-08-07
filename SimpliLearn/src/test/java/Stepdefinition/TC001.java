package Stepdefinition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import reusables.Login;
import reusables.Master_Program;

public class TC001 {
	
	public static WebDriver driver;
	public WebElement uname_field;
	//public Login rlp = new Login(driver); - question 
	//public Master_Program rmp = new Master_Program(driver);
	
	@Given("^Browse Simplilearn$")
	public void browse_simplilearn () throws Throwable
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","D:\\Code\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		/*
		driver.findElement(By.xpath("//a[@title = 'Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@title = 'Log in']")).click();
		Thread.sleep(1000); 
		*/
		
		//OR
		Login rlp = new Login(driver);
		rlp.signup();
		Thread.sleep(1000);
		rlp.signup();
		Thread.sleep(1000);
		
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();	
		}
				
		System.out.println(" TC001 - Step 1 is passed");
		
	}

	@When("^Enter username and password$")
	public void enter_username_and_password () throws Throwable
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(driver, 50);
			/*
			driver.findElement(By.xpath("//input[@name = 'user_login']")).sendKeys("ms.jy05@gmail.com");
			driver.findElement(By.xpath("//form/div/input[@type = 'password']")).sendKeys("WOAdmin1");
			driver.findElement(By.xpath("//div/input[@name = 'btn_login']")).click();
			*/
			//OR
			Login rlp = new Login(driver);
			rlp.enterEmail("ms.jy05@gmail.com");
			rlp.enterPassword("WOAdmin1");
			rlp.clickLogin();
			
			uname_field =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div/ul/li/a[@title = 'My Resources']")));
					  
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			driver.quit();	
		}
		System.out.println(" TC001 - Step 2 is passed");	
	}
	
	@Then("^Make sure user is logged in$")
	public void make_sure_user_is_logged_in () throws Throwable
	{
		try
		{
		Master_Program rmp = new Master_Program(driver);
		Thread.sleep(1000);
		//if(driver.findElement(By.xpath("//div/ul/li/a[@title = 'My Resources']")).isDisplayed())
		//OR
		if(rmp.resourcesHeader())
		{
			System.out.println(" TC001 - Step 3 is passed");	
		}
		else
		{
			System.out.println(" TC001 - Step 3 is failed");
		}
		}
		catch (Exception e)
		{
			System.out.println(" TC001 - Step 3 is failed");
			System.out.println(e.getMessage());
			driver.quit();	
		}
		finally 
		{
			driver.quit();	
		}
	}
	
}
