package reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Master_Program {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div/ul/li/a[@title = 'My Resources']")
	public WebElement my_resources_header;
	
	public Master_Program (WebDriver driver) {  
        this.driver = driver;  
        PageFactory.initElements(driver, this);
	 } 
	
	public boolean resourcesHeader()
	{
		try
		{
		this.my_resources_header.isDisplayed();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage() + "Exception in Master_Program.resourcesHeader");
		}
		return true;
	}
	
}

