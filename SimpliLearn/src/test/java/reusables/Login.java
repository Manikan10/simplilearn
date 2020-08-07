package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	
		@FindBy(xpath = "//a[@title = 'Log in']")
		public WebElement sign_up;
		
		@FindBy(xpath = "//input[@name = 'user_login']")
		public WebElement username;
		
		@FindBy(xpath = "//form/div/input[@type = 'password']")
		public WebElement password;
		
		@FindBy(xpath = "//div/input[@name = 'btn_login']")
		public WebElement login_button;
		
		
		public Login (WebDriver driver) {  
	        this.driver = driver;  
	        PageFactory.initElements(driver, this);
		 } 
		
		public void signup()
		{
			try
			{
			this.sign_up.click();
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage() + "Exception in Login.signup");
			}
		}
		
		public void enterEmail(String u)
		{
			try
			{
			this.username.sendKeys(u);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage() + "Exception in Login.enterEmail");
			}
		}
		
		public void enterPassword(String p)
		{
			try
			{
			this.password.sendKeys(p);
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage() + "Exception in Login.enterPassword");
			}
		}
		
		public void clickLogin()
		{
			try
			{
			this.login_button.click();
			}
			catch (Exception e) 
			{
				System.out.println(e.getMessage() + "Exception in Login.clickLogin");
			}
		}
	
	
}
	